# [Gold III] Letovi - 15197

[문제 링크](https://www.acmicpc.net/problem/15197)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Mirko je na nagradnoj igri osvojio zrakoplovnu kartu za put oko svijeta. Karta se sastoji od n kupona za let f<sub>1</sub>, f<sub>2</sub>, . . . , f<sub>n</sub> &mdash; k-ti kupon se može iskoristiti za jedan direktan let od grada polaska a<sub>k</sub> do grada dolaska b<sub>k</sub>. Za razliku od uobičajnih karata za put oko svijeta, grad dolaska na jednom kuponu ne mora nužno odgovarati gradu polaska na sljedećem kuponu. Svaki kupon za let Mirko može iskoristiti najvi&scaron;e jednom (dakle dozvoljeno je da ga uopće ne iskoristi). Medutim, kuponi se samo smiju koristiti originalnim redoslijedom &mdash; ako Mirko iskoristi kupone f<sub>i</sub> i f<sub>j</sub> gdje je i &lt; j onda kupon f<sub>i</sub> mora iskoristiti prije nego &scaron;to iskoristi kupon f<sub>j</sub>.</p>

<p>Itinerar je niz gradova redom posjećenih na putu oko svijeta, a u kojem se isti grad može pojavljivati i vi&scaron;e od jednom. Prvi i posljednji grad u itineraru mora biti Zagreb gdje Mirko živi, a itinerar mora sadržavati barem jo&scaron; jedan drugi grad. Neka je m broj različitih takvih itinerara koje Mirko može ostvariti sa svojom kartom. Odredite koliko je m modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>U prvom redu se nalazi prirodni broj n (1 &le; n &le; 300 000) &mdash; broj kupona za let. U k-om od sljedećih n redova se nalaze dva različita niza znakova a<sub>k</sub> i b<sub>k</sub> &mdash; kodovi grada polaska i grada dolaska na k-tom kuponu. Svaki kod grada je niz od točno tri velika slova engleske abecede. Kod grada Zagreba je ZAG.</p>

### 출력

<p>Ispi&scaron;ite traženi broj itinerara modulo 10<sup>9</sup> + 7.</p>

### 힌트

<p>U prvom primjeru test podataka, mogući itinerari su <code>ZAG-SPU-ZAGi ZAG-SPU-ZAG-SPU-ZAG</code>.</p>