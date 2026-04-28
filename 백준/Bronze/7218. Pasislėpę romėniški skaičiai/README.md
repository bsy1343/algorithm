# [Bronze III] Pasislėpę romėniški skaičiai - 7218

[문제 링크](https://www.acmicpc.net/problem/7218)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 302, 정답: 242, 맞힌 사람: 212, 정답 비율: 80.608%

### 분류

구현, 문자열

### 문제 설명

<p>Bronius mokosi atpažinti romėni&scaron;kus skaičius nuo 1 iki 12. Romėni&scaron;kai užra&scaron;yti &scaron;iuos skaičius užtenka trijų simbolių I, V ir X, o užra&scaron;omi jie taip:</p>

<table class="table table-bordered table-center-50 th-center td-center">
	<tbody>
		<tr>
			<th>1</th>
			<th>2</th>
			<th>3</th>
			<th>4</th>
			<th>5</th>
			<th>6</th>
			<th>7</th>
			<th>8</th>
			<th>9</th>
			<th>10</th>
			<th>11</th>
			<th>12</th>
		</tr>
		<tr>
			<td>I</td>
			<td>II</td>
			<td>III</td>
			<td>IV</td>
			<td>V</td>
			<td>VI</td>
			<td>VII</td>
			<td>VIII</td>
			<td>IX</td>
			<td>X</td>
			<td>XI</td>
			<td>XII</td>
		</tr>
	</tbody>
</table>

<p>Pasipraktikavimui Bronius ant lentos užsira&scaron;ė atsitiktinę seką s<sub>i</sub> (1 &le; i &le; N) i&scaron; simbolių I, V ir X. &Scaron;ioje sekoje Bronius bando atrasti besislepiančius romėni&scaron;kus skaičius nuo 1 iki 12. Pvz. sekoje XIIIX slepiasi skaičiai 1, 2, 3, 9, 10, 11, 12.</p>

<p>Raskite visus skaičius nuo 1 iki 12, kurie slepiasi Broniaus užra&scaron;ytoje sekoje.</p>

### 입력

<p>Pirmoje pradinių duomenų eilutėje pateiktas teigiamas sveikasis skaičius &ndash; sekos ilgis N.</p>

<p>Antroje eilutėje be tarpų pateikti N simbolių s<sub>i</sub>. Galimi simboliai &ndash; I, V ir X.</p>

### 출력

<p>Vienintelėje rezultatų failo eilutėje i&scaron;veskite tarpais atskirtus visus tokius skaičius didėjimo tvarka.</p>

### 제한

<ul>
	<li>1 &le; N &le; 100</li>
	<li>s<sub>i</sub> &isin; {I, V, X}</li>
</ul>