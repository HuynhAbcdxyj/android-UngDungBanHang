package com.campuscoders.posterminalapp.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import com.campuscoders.posterminalapp.R
import com.campuscoders.posterminalapp.domain.model.Categories
import com.campuscoders.posterminalapp.domain.model.Customers
import com.campuscoders.posterminalapp.domain.model.Products
import com.campuscoders.posterminalapp.domain.use_case.sale.SaveAllCategoriesUseCase
import com.campuscoders.posterminalapp.domain.use_case.sale.SaveAllProductsUseCase
import com.campuscoders.posterminalapp.domain.use_case.sale.SaveCustomerUseCase
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import javax.inject.Inject

class DatabaseInitializer @Inject constructor(
    private val saveAllCategoriesUseCase: SaveAllCategoriesUseCase,
    private val saveAllProductsUseCase: SaveAllProductsUseCase,
    private val saveCustomerUseCase: SaveCustomerUseCase
) {

    suspend fun initializeCategories(context: Context,packageName: String) {
        val uriList = getCategoryImageUris(context,packageName)
        val arrayList = arrayOf<Categories>(
            Categories("0000", "Đồ ăn", "-", uriList[0]),
            Categories("0001", "Đồ uống", "-", uriList[1]),
            Categories("0002", "Trái cây", "-", uriList[2]),
            Categories("0003", "Chăm sóc cá nhân", "-", uriList[3]),
            Categories("0004", "Kem", "-", uriList[4]),
            Categories("0005", "Đồ trẻ nhỏ", "-", uriList[5]),
            Categories("0006", "Hàng bánh", "-", uriList[6]),
            Categories("0007", "Rau củ", "-", uriList[7]),
            Categories("0008", "Đồ ăn vặt", "-", uriList[8]),
            Categories("0009", "Thuốc", "-", uriList[9]),
            Categories("0010", "Đồ gia dụng", "-", uriList[10])
        )
        saveAllCategoriesUseCase.executeSaveAllCategories(*arrayList)
    }

    suspend fun initializeProducts(context: Context, packageName: String) {
        val uriList = getProductImageUris(context,packageName)
        val arrayList = arrayOf<Products>(
            Products("10","Kháng sinh","0001","-",uriList[0],"123456789012",
                "46","0","8","-","10","-","-",
                "-"),
            Products("10","Thuốc giảm đau","0002","-",uriList[1],"234567890123",
                "24","25","8","-","10","-","-",
                "-"),
            Products("3","Chuối (1 Kg)","0003","-",uriList[2],"345678901234",
                "35","20","20","-","10","-","-",
                "-"),
            Products("3","Táo (1 Kg)","0004","-",uriList[3],"456789012345",
                "15","0","20","-","10","-","-",
                "-"),
            Products("3","Nho (1 Kg)","0005","-",uriList[4],"567890123456",
                "20","50","20","-","10","-","-",
                "-"),
            Products("3","Dưa hấu (1 Kg)","0006","-",uriList[5],"678901234567",
                "12","50","10","-","10","-","-",
                "-"),
            Products("8","Cà rốt (1 Kg)","0007","-",uriList[6],"789012345678",
                "8","75","10","-","10","-","-",
                "-"),
            Products("8","Cà chua (1 Kg)","0008","-",uriList[7],"890123456789",
                "25","00","10","-","10","-","-",
                "-"),
            Products("8","Ớt (1 Kg)","0009","-",uriList[8],"901234567890",
                "30","50","10","-","10","-","-",
                "-"),
            Products("1","Súp","0010","-",uriList[9],"012345678901",
                "42","50","10","-","10","-","-",
                "-"),
            Products("1","Bánh mì kẹp thịt","0011","-",uriList[10],"987654321098",
                "75","0","20","-","10","-","-",
                "-"),
            Products("1","Sushi","0012","-",uriList[11],"876543210987",
                "110","0","20","-","10","-","-",
                "-"),
            Products("1","Cá nướng","0013","-",uriList[12],"765432109876",
                "82","50","10","-","10","-","-",
                "-"),
            Products("1","Salad Caesar","0014","-",uriList[13],"654321098765",
                "30","0","10","-","10","-","-",
                "-"),
            Products("7","Bánh mì","0015","-",uriList[14],"543210987654",
                "15","0","10","-","10","-","-",
                "-"),
            Products("7","Bánh sừng bò","0016","-",uriList[15],"432109876543",
                "28","50","10","-","10","-","-",
                "-"),
            Products("2","Nước (0.5 L)","0017","-",uriList[16],"8696971191568",
                "5","0","10","-","10","-","-",
                "-"),
            Products("2","Coca (1 L)","0018","-",uriList[17],"210987654321",
                "18","50","10","-","10","-","-",
                "-"),
            Products("2","Nước ép trái cây (1 L)","0019","-",uriList[18],"109876543210",
                "15","25","10","-","10","-","-",
                "-"),
            Products("4","Kem đánh răng","0020","-",uriList[19],"890123456789",
                "38","25","10","-","10","-","-",
                "-"),
            Products("4","Dầu gội","0021","-",uriList[20],"789012345678",
                "55","0","10","-","10","-","-",
                "-"),
            Products("4","Xà phòng","0022","-",uriList[21],"678901234567",
                "27","50","10","-","10","-","-",
                "-"),
            Products("9","Bim bim","0023","-",uriList[22],"567890123456",
                "20","0","10","-","10","-","-",
                "-"),
            Products("9","Kẹo dẻo","0024","-",uriList[23],"456789012345",
                "16","25","10","-","10","-","-",
                "-"),
            Products("5","Kem sô cô la","0025","-",uriList[24],"345678901234",
                "25","25","10","-","10","-","-",
                "-"),
            Products("5","Kem trái cây","0026","-",uriList[25],"234567890123",
                "22","0","10","-","10","-","-",
                "-"),
            Products("2","Trà","0027","-",uriList[26],"482837774819",
                "10","0","10","-","10","-","-",
                "-"),
            Products("2","Cà phê","0028","-",uriList[27],"611263810032",
                "20","0","10","-","10","-","-",
                "-"),
            Products("8","Dưa leo (1 Kg)","0029","-",uriList[28],"115217629355",
                "17","50","10","-","10","-","-",
                "-"),
            Products("3","Cam (1 Kg)","0030","-",uriList[29],"194567890123",
                "25","0","10","-","10","-","-",
                "-"),
            Products("3","Dâu (1 Kg)","0031","-",uriList[30],"881340381743",
                "30","25","10","-","10","-","-",
                "-"),
            Products("1","Thịt viên","0032","-",uriList[31],"857202001123",
                "62","50","10","-","10","-","-",
                "-"),
            Products("1","Mì Ý","0033","-",uriList[32],"253005217273",
                "40","0","10","-","10","-","-",
                "-"),
            Products("1","Bánh mì kẹp","0034","-",uriList[33],"112202001123",
                "25","50","10","-","10","-","-",
                "-"),
            Products("1","Khoai tây chiên","0035","-",uriList[34],"722201831323",
                "23","0","10","-","10","-","-",
                "-"),
            Products("1","Gà nướng lò","0036","-",uriList[35],"111146112733",
                "75","0","10","-","10","-","-",
                "-")
        )
        saveAllProductsUseCase.executeSaveAllProducts(*arrayList)
    }

    suspend fun initializeCustomer() {
        saveCustomerUseCase.executeSaveCustomer(
            Customers(Constants.CUSTOMER_VKN_TCKN,Constants.CUSTOMER_COMPANY_NAME,Constants.CUSTOMER_FIRST_NAME,
                Constants.CUSTOMER_LAST_NAME, Constants.CUSTOMER_PHONE_NUMBER, Constants.CUSTOMER_EMAIL, Constants.CUSTOMER_PROVINCE,
                Constants.CUSTOMER_DISTRICT, Constants.CUSTOMER_TAX_OFFICE, Constants.CUSTOMER_ADDRESS)
        )
    }

    private fun getCategoryImageUris(context: Context, packageName: String): List<String> {
        val imageUris = mutableListOf<String>()

        val drawableMappings = mapOf(
            R.drawable.food to "food",
            R.drawable.drinks to "drinks",
            R.drawable.fruits to "fruits",
            R.drawable.personalhygiene to "personalhygiene",
            R.drawable.icecream to "icecream",
            R.drawable.baby to "baby",
            R.drawable.bakery to "bakery",
            R.drawable.vegetables to "vegetables",
            R.drawable.snacks to "snacks",
            R.drawable.medicine to "medicine",
            R.drawable.furniture to "furniture"
        )

        for ((drawableResId, fileName) in drawableMappings) {
            val uri = saveDrawableToCacheAndReturnUri(context, packageName, drawableResId, fileName)
            imageUris.add(uri)
        }

        return imageUris
    }

    private fun getProductImageUris(context: Context, packageName: String): List<String> {
        val imageUris = mutableListOf<String>()

        val drawableMappings = mapOf(
            R.drawable.antibiotic to "antibiotic",
            R.drawable.painkiller to "painkiller",
            R.drawable.banana to "banana",
            R.drawable.apple to "apple",
            R.drawable.grapes to "grapes",
            R.drawable.watermelon to "watermelon",
            R.drawable.carrot to "carrot",
            R.drawable.tomatoe to "tomatoe",
            R.drawable.pepper to "pepper",
            R.drawable.soup to "soup",
            R.drawable.hamburger to "hamburger",
            R.drawable.sushi to "sushi",
            R.drawable.fish to "fish",
            R.drawable.salad to "salad",
            R.drawable.bread to "bread",
            R.drawable.croissant to "croissant",
            R.drawable.water to "water",
            R.drawable.coke to "coke",
            R.drawable.fruitjuice to "fruitjuice",
            R.drawable.toothpaste to "toothpaste",
            R.drawable.shampoo to "shampoo",
            R.drawable.soap to "soap",
            R.drawable.chips to "chips",
            R.drawable.gummybears to "gummybears",
            R.drawable.blackicecream to "blackicecream",
            R.drawable.fruiticecream to "fruiticecream",
            R.drawable.cay to "cay",
            R.drawable.kahve to "kahve",
            R.drawable.salatalik to "salatalik",
            R.drawable.portakal to "portakal",
            R.drawable.cilek to "cilek",
            R.drawable.kofte to "kofte",
            R.drawable.makarna to "makarna",
            R.drawable.sandvic to "sandvic",
            R.drawable.patates to "patates",
            R.drawable.tavuk to "tavuk"
        )

        for ((drawableResId, fileName) in drawableMappings) {
            val uri = saveDrawableToCacheAndReturnUri(context, packageName, drawableResId, fileName)
            imageUris.add(uri)
        }

        return imageUris
    }

    private fun saveDrawableToCacheAndReturnUri(context: Context, packageName: String, drawableResId: Int, fileName: String): String {
        val drawable: Drawable? = ContextCompat.getDrawable(context, drawableResId)
        val bitmap: Bitmap? = (drawable as? BitmapDrawable)?.bitmap

        val tempFile = File(context.cacheDir, "$fileName.png")

        try {
            val outStream = FileOutputStream(tempFile)
            bitmap?.compress(Bitmap.CompressFormat.PNG, 100, outStream)
            outStream.flush()
            outStream.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        val tempUri: Uri = FileProvider.getUriForFile(context, "$packageName.fileprovider", tempFile)
        return tempUri.toString()
    }
}