/*
================================================
نام فایل:
InvoiceScreen.kt
وظیفه:
نمایش اولیه صفحه فاکتور.
منطق ایجاد فاکتور در UseCase قرار دارد و اینجا فقط UI است.
ارتباط:
Screen -> ViewModel -> CreateInvoiceUseCase
================================================
*/

package com.hesabdari.presentation.invoice

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InvoiceScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "مدیریت فاکتور",
            style = MaterialTheme.typography.headlineMedium
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("نام طرف حساب") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("مبلغ") },
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("ثبت فاکتور")
        }
    }
}
