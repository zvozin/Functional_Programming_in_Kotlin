package me.alexz.ch4_Handling_Errors_Without_Exceptions

import me.alexz.ch3_Functional_Data_Structures.List
import me.alexz.ch3_Functional_Data_Structures.map

/**
 * Created by azuzin37 on 8/14/16. Yes, indeed.
 */

fun List<Double>.variance(): Option<Double> =
        mean().flatMap{ m -> map{ t -> Math.pow(t - m, 2.0)}.mean()}


