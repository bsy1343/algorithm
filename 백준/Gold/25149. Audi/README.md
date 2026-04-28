# [Gold V] Audi - 25149

[문제 링크](https://www.acmicpc.net/problem/25149)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 12, 맞힌 사람: 10, 정답 비율: 58.824%

### 분류

수학, 조합론

### 문제 설명

<p>Dominik je kupio automobile za svoj novi vozni park. Poznato je da Audi ko&scaron;ta A tisuća eura, Nissan B tisuća eura, a Ferrari C tisuća eura.</p>

<p>Nije nam poznato koliko je Dominik kupio Audija, koliko Nissana, a koliko Ferrarija, ali načuli smo sljedeće:</p>

<ul>
	<li>Kupio je najmanje jedan, a najvi&scaron;e N automobila svakog proizvođača.</li>
	<li>Ukupni iznosi potro&scaron;eni na Audije, Nissane i Ferrarije međusobno su različiti.</li>
	<li>Na Audije je potro&scaron;eno najvi&scaron;e, a na Ferrarije najmanje novca.</li>
</ul>

<p>Iako nam ove informacije nisu dovoljne da zaključimo koliko je kojih automobila kupio Dominik, možemo izbrojiti koliko mogućnosti postoji. Preciznije, koliko ima trojki (X, Y, Z) takvih da je Dominik mogao kupiti X Audija, Y Nissana i Z Ferrarija u skladu s gornjim informacijama?</p>

### 입력

<p>U prvom retku nalazi se prirodan broj N (1 &le; N &le; 1 000 000) iz teksta zadatka.</p>

<p>U sljedećem retku nalaze se tri prirodna broja A, B i C (1 &le; A, B, C &le; 1000) iz teksta zadatka.</p>

### 출력

<p>U jedini redak ispi&scaron;i traženi broj mogućnosti.</p>

### 힌트

<p>Opis prvog test podatka: Dominik je mogao kupiti:</p>

<ul>
	<li>četiri Audija, tri Nissana i jednog Ferrarija,</li>
	<li>četiri Audija, tri Nissana i dva Ferrarija,</li>
	<li>četiri Audija, dva Nissana i jednog Ferrarija,</li>
	<li>tri Audija, dva Nissana i jednog Ferrarija.</li>
</ul>

<p>Opis drugog test podatka: Jedina je mogućnost pet Audija, dva Nissana i jedan Ferrari.</p>