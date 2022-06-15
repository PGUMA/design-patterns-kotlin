package lab.pguma.design_patterns.strategy

import io.kotest.core.spec.style.StringSpec

class MemberTest : StringSpec({
    "動作確認"  {
        Member(GoldMember, ApplicationBenefits.NONE).paid()
        Member(SilverMember, ApplicationBenefits.NONE).paid()
        Member(NormalMember, ApplicationBenefits.NONE).paid()

        Member(GoldMember, ApplicationBenefits.Trial).paid()
    }
})
