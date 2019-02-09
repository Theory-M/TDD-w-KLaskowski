package designpatterns.decorator;

import designpatterns.exercises.decorator.RequiredDigitValidator;

public class RequiredDigitValidatorTest {

    RequiredDigitValidator validator;

//    @Before
//    public void setUp(){

    // ITERATOR
    // new ArrayList().iterator().; poruszanie sie po kolekcji za pomoca
    // new HashSet<>().iterator().; ITERATORA -- jest to bardzo szczegolny przypadek FASADY
    // warto jest zrobic swoj iterator przy pisaniu swojej kolekcji, jednak pisanei kolekcji raczej sie nie zdarza

//        RequiredDigitValidator validator = new RequiredDigitValidator(basicValidator)
//    }

    // po zaimportowaniu Mockito
//    BasicPasswordValidator basicValidator = Mockito.mock.(BasicPasswordValidator.class);
    // ten test nie jest do konca testem jednostkowym, zeby to tak zrobic,
    // nalezaloby uzyc MOCKITO
//    @Test
//    public void testValidatorTestsPasswordWithDigit(){
//        // GIVEN
//        RequiredDigitValidator validator = new RequiredDigitValidator(new BasicPasswordValidator());
//
//        // WHEN
//        boolean result = validator.isValid("1234");
//
//        // THEN
//        Assert.assertTrue(result);
//    }

    // MOCKITO
//    @Test
//    public void testValidatorTestsPasswordWithDigit(){
//        // GIVEN -- nie bedzie potrzebne bo mam Before
//        RequiredDigitValidator validator = new RequiredDigitValidator(basicValidator);
//        Mockito.when(basicValidator.isValid(Mockito.anyString())).thenReturn(true);
//
//        boolean result = validator.isValid("1234");
//
//        assertTrue(result);
//    }

    // mozna jeszcze weryfikowac MOCK -- w tym wypadku czy zostalo uzyte dokladnie 1 raz
    // Mockito.verify(basicValidator, Mockito.times(1)).isValid(Mock...)
}
