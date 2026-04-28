# [Gold V] Skaitmens keitimas - 7253

[문제 링크](https://www.acmicpc.net/problem/7253)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p>Dovydas pasakė Justui du natūraliuosius skaičius N ir M. Justo užduotis &ndash; i&scaron; N padaryti kuo didesnį skaičių. Tą jis gali padaryti keisdamas po vieną N skaitmenį taip, kad po kiekvieno keitimo skaičiaus dalybos i&scaron; M liekana padidėtų. Keičiant skaitmenį neleidžiama pirmojo skaitmens pakeisti nuliu (0).</p>

<p>Pavyzdžiui, jei N = 1399 ir M = 11, tai N dalybos i&scaron; M liekana i&scaron; pradžių yra 1399 mod 11 = 2. Jei Justas pirmuoju žingsniu keistų paskutinįjį N skaitmenį, tai jį rinktųsi i&scaron; 0, 1, . . . , 6, nes &scaron;ie variantai padidina liekaną:</p>

<table class="table table-bordered table-center-50 td-center th-center">
	<tbody>
		<tr>
			<th>N</th>
			<td>1390</td>
			<td>1391</td>
			<td>1392</td>
			<td>1393</td>
			<td>1394</td>
			<td>1395</td>
			<td>1396</td>
			<td>1397</td>
			<td>1398</td>
			<td>1399</td>
		</tr>
		<tr>
			<th>liekana</th>
			<td>4</td>
			<td>5</td>
			<td>6</td>
			<td>7</td>
			<td>8</td>
			<td>9</td>
			<td>10</td>
			<td>0</td>
			<td>1</td>
			<td>2</td>
		</tr>
	</tbody>
</table>

<p>Sakykime, kad jis pasirenka 3, taigi N dabar yra 1393. Jei Justas dabar keistų pirmąjį skaitmenį, tai vienintelis variantas yra 9 (atkreipkite dėmesį, kad neleidžiama pirmojo skaitmens pakeisti į 0):</p>

<table class="table table-bordered table-center-50 td-center th-center">
	<tbody>
		<tr>
			<th>N</th>
			<td>1393</td>
			<td>2393</td>
			<td>3393</td>
			<td>4393</td>
			<td>5393</td>
			<td>6393</td>
			<td>7393</td>
			<td>8393</td>
			<td>9393</td>
		</tr>
		<tr>
			<th>liekana</th>
			<td>7</td>
			<td>6</td>
			<td>5</td>
			<td>4</td>
			<td>3</td>
			<td>2</td>
			<td>1</td>
			<td>0</td>
			<td>10</td>
		</tr>
	</tbody>
</table>

<p>Skaičiaus 9393 daugiau keisti negalima, nes jau gauta didžiausia įmanoma dalybos i&scaron; 11 liekana (9393 mod 11 = 10). Tai būtų Justo rezultatas.</p>

<p>Tačiau tai nėra geriausias įmanomas rezultatas. Geriausias rezultatas yra 9899, kurį galima pasiekti atliekant, pavyzdžiui, tokius žingsnius:</p>

<table class="table table-bordered table-center-30 td-center th-center">
	<tbody>
		<tr>
			<th>N</th>
			<td>1399 &rarr; 1899 &rarr; 9899</td>
		</tr>
		<tr>
			<th>liekana</th>
			<td>2 &rarr; 7 &rarr; 10</td>
		</tr>
	</tbody>
</table>

<p>Nustatykite, kokį didžiausią skaičių Justas gali pasiekti.</p>

### 입력

<p>Vienintelėje eilutėje pateikiami skaičiai N ir M.</p>

### 출력

<p>I&scaron;veskite didžiausią skaičių, kokį Justas gali pasiekti.</p>

### 제한

<ul>
	<li>1 &le; N &lt; 10<sup>17</sup></li>
	<li>1 &le; M &le; 10<sup>9</sup></li>
</ul>