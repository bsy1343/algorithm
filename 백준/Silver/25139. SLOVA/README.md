# [Silver I] SLOVA - 25139

[문제 링크](https://www.acmicpc.net/problem/25139)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 19, 맞힌 사람: 16, 정답 비율: 88.889%

### 분류

수학, 구현, 문자열, 조합론

### 문제 설명

<p>Mirko je kupio <strong>leksikografski</strong> uzlazno sortiran popis svih riječi duljine točno N koje se sastoje od prvih N slova <strong>engleske abecede</strong> u kojima se <strong>svako od tih slova pojavljuje točno jednom</strong>. Popis je složen tako da je u N redaka zapisana po jedna riječ. Npr. za N je 3 popis izgleda ovako {abc, acb, bac, bca, cab, cba}. Za razliku od pro&scaron;log zadatka, budući da se radi o engleskoj abecedi, u ovom zadatku znakovi L, N, i J nemaju poseban značaj.</p>

<p>Podsjetimo se da su dvije riječi leksikografski uzlazno sortirane ako riječ koja je zapisana prije počinje sa slovom koje je prije u abecedi od slova s kojim počinje druga riječ, a ako su prva slova jednaka, tada se gleda odnos drugog slova u riječi, itd.</p>

<p>Udaljenost dviju riječi definiramo kao <strong>razliku njihovih pozicija na popisu</strong>. Tako su riječi <strong>acb</strong> i <strong>bca</strong> udaljene 2, dok su riječi cba i abc udaljene za 5.</p>

<p>Za zadane dvije riječi s popisa, odredi <strong>njihovu udaljenost</strong>.</p>

### 입력

<p>U prvom retku nalazi se prirodan broj N (1 &le; N &le; 26), broj kori&scaron;tenih slova. Sljedeća dva retka sadrže po dvije riječi s popisa, riječ A i riječ B. Budući da su s popisa, obje riječi su duljine N, sastavljene su od prvih N malih slova engleske abecede i svako slovo se pojavljuje točno jednom. Ulazni podaci bit će takvi da će rje&scaron;enje za njih uvijek biti manje od 2<sup>64</sup>.</p>

### 출력

<p>Ispi&scaron;i traženu udaljenost između riječi A i B.</p>

### 힌트

<p>Poja&scaron;njenje drugog test primjera: Popis izgleda ovako:</p>

<pre>
1-6: abcd, abdc, acbd, acdb, adbc, adcb,
7-12: <strong>bacd</strong>, badc, bcad, bcda, bdac, bdca,
13-18: cabd, cadb, cbad, cbda, cdab, cdba,
19-24: dabc, dacb, dbac, dbca, dcab, <strong>dcba</strong></pre>

<p>Jedna riječ se nalazi na poziciji 7, dok se druga riječ nalazi na poziciji 24. Razlika je 17.</p>