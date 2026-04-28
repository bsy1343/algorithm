# [Gold III] Melagiai - 7228

[문제 링크](https://www.acmicpc.net/problem/7228)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 20, 맞힌 사람: 16, 정답 비율: 84.211%

### 분류

그래프 이론, 그래프 탐색, 강한 연결 요소, 이분 그래프, 2-sat

### 문제 설명

<p>Bitlandijoje netrukus prasidės Seimo rinkimai, o tai rei&scaron;kia, kad nacionalinėje televizijoje &bdquo;Bit TV&ldquo; vyksta politiniai debatai, kuriuose dalyvauja N kandidatų, i&scaron;traukusių numerius nuo 1 iki N. Kaip ir kasmet, Bronius &scaron;iuos debatus labai įdėmiai seka. Jis pastebėjo, kad &scaron;iais metais ypač dažnai kartojosi &scaron;ie du scenarijai:</p>

<ul>
	<li>i-tasis kandidatas teigia, kad j-tasis kandidatas visada meluoja,</li>
	<li>i-tasis kandidatas teigia, kad j-tasis kandidatas visada sako tiesą.</li>
</ul>

<p>Visus tokius teiginius Bronius užsira&scaron;ė ir dabar nori patikrinti, ar jie vienas kitam neprie&scaron;tarauja.</p>

<p>Sakysime, kad teiginiai neprie&scaron;tarauja vienas kitam, jei egzistuoja toks kandidatų paskirstymas į melagius ir nemelagius, kad visi melagių teiginiai būtų neteisingi, o visi nemelagių teiginiai būtų teisingi.</p>

<p>Padėkite Broniui nustatyti, ar toks kandidatų paskirstymas egzistuoja.</p>

### 입력

<p>Pirmoje eilutėje pateikti du sveikieji teigiami skaičiai &ndash; kandidatų skaičius N ir Broniaus surinktų teiginių skaičius M.</p>

<p>Toliau pateikta M eilučių. i-toje eilutėje pateikti i-tą teiginį apibūdinantys trys sveikieji skaičiai a<sub>i</sub>, b<sub>i</sub> ir m<sub>i</sub>:</p>

<ul>
	<li>Jei m<sub>i</sub> = 1, a<sub>i</sub>-tasis kandidatas teigė, kad b<sub>i</sub>-tasis kandidatas visada meluoja.</li>
	<li>Jei m<sub>i</sub> = 0, a<sub>i</sub>-tasis kandidatas teigė, kad b<sub>i</sub>-tasis kandidatas visada sako tiesą.</li>
</ul>

<p>(a<sub>i</sub>, b<sub>i</sub>) poros pradiniuose duomenyse yra unikalios, t. y., kandidatas a<sub>i</sub> gali pateikti tik vieną teiginį apie kandidatą b<sub>i</sub> arba visai jo nepateikti.</p>

### 출력

<p>I&scaron;veskite <code>EGZISTUOJA</code>, jei apra&scaron;ytas paskirstymas į melagius ir nemelagius egzistuoja, arba <code>NEEGZISTUOJA</code>, jei neegzistuoja.</p>

### 제한

<ul>
	<li>1 &le; N, M &le; 100 000</li>
	<li>1 &le; a<sub>i</sub> &ne; b<sub>i</sub> &le; N</li>
	<li>0 &le; m<sub>i</sub> &le; 1 (1 &le; i &le; M).</li>
</ul>