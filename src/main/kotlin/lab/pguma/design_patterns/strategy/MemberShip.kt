package lab.pguma.design_patterns.strategy

interface MemberShip {
    val monthlyFee: Int
}

object GoldMember: MemberShip {
    override val monthlyFee = 20_000
}

object SilverMember: MemberShip {
    override val monthlyFee = 15_000
}

object NormalMember: MemberShip {
    override val monthlyFee = 10_000
}