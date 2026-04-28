# [Gold V] Trokut - 14135

[문제 링크](https://www.acmicpc.net/problem/14135)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 256 MB

### 통계

제출: 22, 정답: 13, 맞힌 사람: 12, 정답 비율: 60.000%

### 분류

수학, 이분 탐색

### 문제 설명

<p>Ako poredamo sve prirodne brojeve tako da u prvom redu zapi&scaron;emo jedan broj, u sljedećem dva te u svakom sljedećem po jedan vi&scaron;e, dobit ćemo geometrijsku strukturu kakva je prikazana na slici.&nbsp;</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/14135/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%202.31.29.png" style="height:185px; width:212px" /></p>

<p>Unutar ove strukture možemo prepoznati pravilne trokute. Pravilan trokut je definiran sa tri broja koji u ovoj strukturi čine vrhove trokuta uz sljedeće uvijete:</p>

<ol>
	<li>Stranice tog trokuta su jednake duljine.</li>
	<li>Stranice tog trokuta su paralelne sa vezama izme&ntilde;u brojeva 1, 2 i 3.</li>
</ol>

<p>Na primjer, brojevi 4, 6 i 13 čine pravilan trokut, dok brojevi 2, 6 i 8 ne čine pravilan trokut jer njegove stranice nisu paralelne sa vezama izme&ntilde;u brojeva 1, 2 i 3.</p>

<p>Napi&scaron;ite program koji za zadana dva broja, pronalazi treći broj tako ta tri broja čine pravilan trokut.&nbsp;</p>

### 입력

<p>U prvom i jedinom retku nalaze se dva prirodna broja A i B, 1 &lt;= A,B &lt;= 500 000 000, A &ne; B.&nbsp;</p>

### 출력

<p>U prvom i jedinom retku potrebno je ispisati brojeve me&ntilde;usobno odvojene razmakom koji označavaju moguće pozicije trećeg vrha.</p>

<p>Ako ima vi&scaron;e takvih brojeva, potrebno ih je ispisati poredano od manjeg prema većem.</p>

<p>Ako ne postoji nijedan takav broj, potrebno je ispisati &bdquo;nema&ldquo;.</p>