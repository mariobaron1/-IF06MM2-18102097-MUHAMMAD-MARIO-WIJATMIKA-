package com.MuhammadMarioWijatmika_18102097.praktikum144.`interface`

import com.MuhammadMarioWijatmika_18102097.praktikum144.model.Login
import com.MuhammadMarioWijatmika_18102097.praktikum144.model.Quote

interface MainView {
    fun showMessage(messsage : String)
    fun resultQuote(data: ArrayList<Quote>)
    fun resultLogin(data: Login)
}