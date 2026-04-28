# [Platinum V] Alarmi - 28590

[문제 링크](https://www.acmicpc.net/problem/28590)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Mirko na svom mobitelu trenutno ima postavljena tri alarma. U sljedećih $N$ dana mora se na vrijeme probuditi kako bi učio za prijemni ispit za upis u srednju &scaron;kolu. Na mobitelu ne može istovremeno imati postavljena vi&scaron;e od tri alarma pa zbog toga, kad navečer postavlja alarm za sljedeći dan, mora neki od postojeća tri pomaknuti na vrijeme u koje se želi probuditi. Jednim dodirom može povećati ili smanjiti vrijeme alarma za jednu minutu. Prilikom pomicanja sata nije moguće preći s 23:59 na 00:00 i obrnuto. Primjerice, da alarm sa 7:30 postavi na 8:45 potrebno mu je 75 dodira, a da alarm s 23:58 postavi na 00:07 treba mu 1431 dodir.</p>

<p>Odredi koliko mu je najmanje ukupno dodira potrebno da bi svaki dan barem jedan alarm zvonio u željeno vrijeme.</p>

### 입력

<p>U prva tri retka su po dva cijela broja $H$ ($0 &le; H &le; 23$) i $M$ ($0 &le; M &le; 59$), redom sati i minute alarma na Mirkovom mobitelu.</p>

<p>U četvrtom retku je prirodni broj $N$, broj iz teksta zadatka.</p>

<p>U sljedećih $N$ redaka su po dva cijela broja $H$ ($0 &le; H &le; 23$) i $M$ ($0 &le; M &le; 59$), redom sati i minute vremena u kojima se Mirko mora probuditi.</p>

### 출력

<p>U prvi redak ispi&scaron;i odgovor na pitanje iz teksta zadatka.</p>

### 힌트

<p>Opis drugog probnog primjera:</p>

<table class="table table-bordered td-center table-center-70">
	<tbody>
		<tr>
			<td> </td>
			<td>Početno vrijeme</td>
			<td>Prvi dan</td>
			<td>Drugi dan</td>
			<td>Treći dan</td>
			<td>Četvrti dan</td>
		</tr>
		<tr>
			<td>Prvi alarm</td>
			<td>14:01</td>
			<td>14:01</td>
			<td>14:01</td>
			<td>14:01</td>
			<td>14:01</td>
		</tr>
		<tr>
			<td>Drugi alarm</td>
			<td>19:02</td>
			<td>19:02</td>
			<td>19:02</td>
			<td>19:02</td>
			<td>21:39</td>
		</tr>
		<tr>
			<td>Treći alarm</td>
			<td>10:54</td>
			<td>01:49</td>
			<td>05:03</td>
			<td>06:37</td>
			<td>06:37</td>
		</tr>
	</tbody>
</table>