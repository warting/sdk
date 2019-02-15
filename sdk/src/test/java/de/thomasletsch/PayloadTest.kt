package de.thomasletsch

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

internal class PayloadTest {

    @Test
    fun testJCMPPayload() {
        val commandGetUsers = "{\"CMD\":\"GET_USERS\"}"
        val payload = Payload.jmcp(commandGetUsers)
        assertThat(payload.toByteArray().toHexString()).isEqualTo("7B22434D44223A224745545F5553455253227D")
        assertThat(payload.toString()).isEqualTo(commandGetUsers)

    }

    @Test
    fun testJCMP2() {
        val getUsersCommand = "867B223030223A312C223031223A302C223032223A302C223033223A302C223034223A302C223035223A302C223036223A302C223037223A302C223038223A302C223039223A302C223130223A302C223131223A302C223132223A302C223133223A302C223134223A302C223135223A302C223136223A302C223137223A302C223138223A302C223139223A302C223230223A302C223231223A302C223232223A302C223233223A302C223234223A302C223235223A302C223236223A302C223237223A302C223238223A302C223239223A302C223330223A302C223331223A302C223332223A302C223333223A302C223334223A302C223335223A302C223336223A302C223337223A302C223338223A302C223339223A302C223430223A302C223431223A302C223432223A302C223433223A302C223434223A302C223435223A302C223436223A302C223437223A302C223438223A302C223439223A302C223530223A302C223531223A302C223532223A302C223533223A302C223534223A302C223535223A302C223536223A302C223537223A302C223538223A302C223539223A302C223630223A302C223631223A302C223632223A302C223633223A307D"
        val result = getUsersCommand.toHexByteArray().toHexStringFromGW()
        println(result)
    }
}
