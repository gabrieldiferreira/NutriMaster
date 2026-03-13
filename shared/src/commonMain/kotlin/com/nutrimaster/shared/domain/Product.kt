package com.nutrimaster.shared.domain

import androidx.compose.ui.graphics.Color
import com.nutrimaster.shared.CategoryBlue
import com.nutrimaster.shared.CategoryGreen
import com.nutrimaster.shared.CategoryPurple
import com.nutrimaster.shared.CategoryRed
import com.nutrimaster.shared.CategoryYellow
import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val id: String,
    val title: String,
    val description: String,
    val thumbnail: Double,
    val category: String,
    val flavors: List<String>? = null,
    val weight: Int? = null,
    val price: Double,
    val isPopular: Boolean,
    val isDiscounted: Boolean,
    val isNew: Boolean,
)
enum class ProductCategory(
    val title: String,
    val color: Color
){
    Protein(
        title = "Proteínas",
        color = CategoryYellow
    ),
    Creatine(
        title = "Creatinas",
        color = CategoryBlue
    ),
    PreWorkout(
        title = "Pré-Treino",
        color = CategoryGreen
    ),
    Gainers(
        title = "Ganhadores de Massa",
        color = CategoryPurple
    ),
    Accessories(
        title = "Acessórios",
        color = CategoryRed
    )
}