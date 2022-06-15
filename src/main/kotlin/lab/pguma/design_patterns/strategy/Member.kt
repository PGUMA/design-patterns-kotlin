package lab.pguma.design_patterns.strategy

class Member(
    private val memberShip: MemberShip,
    private val applicationBenefits: ApplicationBenefits) {

    fun paid() {
        println("月会費は${memberShip.monthlyFee}です。")
        applicationBenefits.apply()
    }
}