package `in`.obvious.ws.writingkotlin

import `in`.obvious.ws.writingkotlin.collections.kotlin.Alignment
import `in`.obvious.ws.writingkotlin.collections.kotlin.Mutant
import `in`.obvious.ws.writingkotlin.collections.kotlin.Rank

private fun collectionsScratch() {
    val mutants = listOf(
        Mutant("Professor X", "Charles Xavier", Alignment.Good, 40, Rank.Leader),
        Mutant("Magneto", "Erik Lehnsherr", Alignment.Evil, 40, Rank.Leader),
        Mutant("Wolverine", "James Howlett", Alignment.Good, 50, Rank.Senior),
        Mutant("Jean Grey", "Jean Grey", Alignment.Good, 15, Rank.Senior),
        Mutant("Shadowcat", "Kitty Pryde", Alignment.Good, 5, Rank.Junior),
        Mutant("Cyclops", "Scott Summers", Alignment.Good, 16, Rank.Senior),
        Mutant("Scarlet Witch", "Wanda Maximoff", Alignment.Evil, 5, Rank.Senior),
        Mutant("Mystique", "Raven Darkholme", Alignment.Evil, 10, Rank.Senior),
        Mutant("Pyro", "John Allerdyce", Alignment.Evil, 5, Rank.Junior)
    )

    // All Mutants with 10+ year exp
    val allMutants10plus = mutants.filter { it.yearsOfExperience >= 10 }

    // Real names of all Good Mutants
    val realNamesOfGoodMutants =
        mutants.filter { it.alignment == Alignment.Good }.map { it.actualName }

    // Concatenate the code names of all the senior mutants with a comma
    val allSeniorCodeNames = mutants.filter { it.rank == Rank.Senior }.joinToString { it.codeName }

    // Concatenate the code names of all the good and evil mutants separately with a comma
    // and then concatenate these two strings together with a " VS. "
    val allGoodVsEvil = mutants
        .partition { it.alignment == Alignment.Good }
        .let { (good, evil) ->
            good.joinToString { it.codeName } + " VS. " + evil.joinToString { it.codeName }
        }
}