# [Platinum IV] Suncokret - 26372

[문제 링크](https://www.acmicpc.net/problem/26372)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 4, 정답 비율: 36.364%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 집합과 맵, 트리를 사용한 집합과 맵, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>Ivica je strastveni ljubitelj bilja. U vrtu ima razne vrste cvijeća, no najdraži su mu suncokreti. Pred njegovom kućom nalazi se N suncokreta poredanih uz ogradu slijeva nadesno. Početna visina i-tog suncokreta je A<sub>i</sub> centimetara. Da bi neki suncokret narastao za X centimetara potrebno ga je zaliti s X litara vode.</p>

<p>Ivica bi želio da njegovi suncokreti budu takvi da im visine budu neopadajuće slijeva nadesno, tj. da nijedan suncokret ne bude niži od nekog koji se nalazi lijevo od njega.</p>

<p>Ivičin susjed Kre&scaron;o voli potajno zalijevati suncokrete pa je u i-toj od Q narednih noći odlučio X<sub>i</sub>-ti suncokret zaliti s Y<sub>i</sub> litara vode.</p>

<p>U svakom od tih Q dana Ivica se probudio i vidio da se visina nekog suncokreta povećala. Bez namjere da to stvarno učini, zapitao se koliko bi mu minimalno litara vode trebalo da visine suncokreta tog dana pretvori u neopadajuće slijeva nadesno.</p>

<p>Kako se Ivica treba brinuti i o ostalim biljkama, moli tebe da mu pomogne&scaron; odrediti odgovore na postavljena pitanja.</p>

### 입력

<p>U prvom retku nalaze se prirodni brojevi N i Q (1 &le; N, Q &le; 100 000), brojevi iz teksta zadatka.</p>

<p>U drugom retku nalazi se niz A od N prirodnih brojeva (1 &le; A<sub>i</sub> &le; 10<sup>9</sup>), brojevi iz teksta zadatka.</p>

<p>U sljedećih Q redaka nalaze se po dva prirodna broja X<sub>i</sub> i Y<sub>i</sub> (1 &le; X<sub>i</sub> &le; N, 1 &le; Y<sub>i</sub> &le; 10<sup>9</sup>), brojevi iz teksta zadatka.</p>

### 출력

<p>U svakom od Q redaka ispi&scaron;ite po jedan cijeli broj, redom odgovore na pitanja iz teksta zadatka.</p>

### 힌트

<p>Opis prvog primjera:</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>i</th>
			<th>Visine suncokreta u i-tom danu:</th>
			<th>Visine u i-tom danu kad bi Ivica zalio suncokrete na optimalan način:</th>
			<th>Odgovor na i-to pitanje:</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td><strong>3</strong>, 3, 2, 2, 4</td>
			<td>3, 3, 3, 3, 4</td>
			<td>0 + 0 + 1 + 1 + 0 = 2</td>
		</tr>
		<tr>
			<td>2</td>
			<td>3, <strong>6</strong>, 2, 2, 4</td>
			<td>3, 6, 6, 6, 6</td>
			<td>0 + 0 + 4 + 4 + 2 = 10</td>
		</tr>
		<tr>
			<td>3</td>
			<td>3, 6, 2, <strong>7</strong>, 4</td>
			<td>3, 6, 6, 7, 7</td>
			<td>0 + 0 + 4 + 0 + 3 = 7</td>
		</tr>
		<tr>
			<td>4</td>
			<td><strong>4</strong>, 6, 2, 7, 4</td>
			<td>4, 6, 6, 7, 7</td>
			<td>0 + 0 + 4 + 0 + 3 = 7</td>
		</tr>
	</tbody>
</table>