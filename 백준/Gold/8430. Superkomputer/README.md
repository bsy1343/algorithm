# [Gold III] Superkomputer - 8430

[문제 링크](https://www.acmicpc.net/problem/8430)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 7, 맞힌 사람: 6, 정답 비율: 54.545%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>Firma BajtoLicz posiada bardzo szybki serwer - BL87. W celu wykorzystania jego możliwości, firma postanowiła uruchomić usługę polegającą na wykonywaniu na serwerze program&oacute;w przysyłanych przez klient&oacute;w. Każdy przysłany program potrzebuje pewnej mocy obliczeniowej na swoje wykonanie.&nbsp;Czas wykonania programu liczy się od momentu otrzymania przez firmę BajtoLicz programu, do chwili zakończenia jego wykonywania.&nbsp;Serwer BL87 jest w stanie wykonywać dowolną liczbę program&oacute;w r&oacute;wnolegle -- każdy z wykonywanych program&oacute;w otrzymuje pewien (zależny od przypisanego priorytetu) procent mocy procesora. Możliwe jest przerywanie i wznawianie wykonywania program&oacute;w z r&oacute;żnymi priorytetami.</p>

<p>Firma zwr&oacute;ciła się do Ciebie z prośbą o pomoc w napisaniu programu, kt&oacute;ry dla danej listy zleceń wyznaczy minimalny sumaryczny czas ich wykonania.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta liczbę oraz opis program&oacute;w, kt&oacute;re muszą zostać wykonane na serwerze,</li>
	<li>wyznaczy najkr&oacute;tszy sumaryczny czas wykonania wszystkich zadań,</li>
	<li>wypisze wynik.</li>
</ul>

### 입력

<p>Pierwszy wiersz zawiera liczbę całkowitą&nbsp;<i>n</i>&nbsp;(1 &le;&nbsp;<i>n</i>&nbsp;&le;&nbsp;100&nbsp;000), oznaczająca liczbę program&oacute;w do wykonania. Każdy z kolejnych&nbsp;<i>n</i>&nbsp;wierszy zawiera dwie liczby całkowite&nbsp;<i>a</i>&nbsp;i&nbsp;<i>b</i>&nbsp;(&nbsp;0 &le;&nbsp;<i>a</i>,&nbsp;<i>b</i>&nbsp;&le;&nbsp;1&nbsp;000&nbsp;000&nbsp;000), reprezentujące odpowiednio, czas pojawienia się programu oraz czas procesora potrzebny na jego wykonanie.</p>

### 출력

<p>Tw&oacute;j program, w pierwszym i jedynym wierszu wyjścia, powinien wypisać jedną liczbę całkowitą&nbsp;<i>k</i>&nbsp;- minimalny sumaryczny czas wykonania wszystkich program&oacute;w.</p>