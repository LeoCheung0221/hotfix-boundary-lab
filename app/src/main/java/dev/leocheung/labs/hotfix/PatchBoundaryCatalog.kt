package dev.leocheung.labs.hotfix

object PatchBoundaryCatalog {
    data class Row(val change: String, val typical: String, val why: String)

    private val rows = listOf(
        Row("Method body replacement", "Often works", "Same class/method slot in dex; ART structure limits apply"),
        Row("Add new method", "Risky", "Dex layout / index limits; patch tools vary"),
        Row("Modify layout XML", "Usually no", "Resources live in separate tables; need resource patch path"),
        Row("Add new R.id", "No", "Resource IDs assigned at compile time"),
        Row("Replace native .so", "Platform dependent", "ABI, signer, and loader policy"),
        Row("Rename Application", "No", "Manifest merge is APK-level, not dex-only"),
    )

    fun render(): String = buildString {
        appendLine("Hotfix boundary matrix (debug education only)")
        appendLine("=".repeat(48))
        rows.forEach {
            appendLine("• ${it.change}")
            appendLine("  Typical: ${it.typical}")
            appendLine("  Why: ${it.why}")
            appendLine()
        }
        appendLine("Baseline greeting: ${Greeting.version()}")
    }
}
