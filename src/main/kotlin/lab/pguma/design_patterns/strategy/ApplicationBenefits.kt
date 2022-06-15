package lab.pguma.design_patterns.strategy

enum class ApplicationBenefits {

    NONE {
        override fun apply() {
            println("特典は特にありません。")
        }
    },
    Trial {
        override fun apply() {
            println("限定割引を適用します。")
        }
    }

    ;

    abstract fun apply()
}