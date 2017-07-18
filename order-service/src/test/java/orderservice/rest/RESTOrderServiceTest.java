package orderservice.rest;

import ordermodel.domain.Order;
import org.assertj.core.api.Assertions;
import org.assertj.core.condition.Join;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Bhuwan Upadhyay
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RESTOrderServiceTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void placeNewOrder() {
        Assertions.assertThat(restTemplate.postForEntity("/orders", buildOrder(), Void.class))
                .is(new Join<ResponseEntity<Void>>() {
                    @Override
                    public boolean matches(ResponseEntity<Void> value) {
                        return value.getStatusCode().is2xxSuccessful();
                    }
                });
    }

    private Order buildOrder() {
        return new Order();
    }
}