# [Silver V] Jasio - 8417

[문제 링크](https://www.acmicpc.net/problem/8417)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 129, 정답: 63, 맞힌 사람: 43, 정답 비율: 44.330%

### 분류

구현, 문자열, 애드 혹

### 문제 설명

<p>Mały Jasio dostał bardzo trudne zadanie do rozwiązania. Ma podaną listę sł&oacute;w i musi policzyć ile z&nbsp;tych sł&oacute;w zawiera palindrom dłuższy niż jeden znak. Palindrom to słowo, kt&oacute;re czytane zar&oacute;wno od początku, jak i od końca, jest takie samo. Palindromem jest więc na przykład słowo ,,ala&#39;&#39;. Natomiast słowo ,,kot&#39;&#39; nie jest palindromem, gdyż czytane od końca brzmi inaczej - ,,tok&#39;&#39;. Przykładowo słowo ,,foo&#39;&#39; zawiera palindrom o długości większej niż jeden - jest to ciąg ,,oo&#39;&#39;, natomiast słowo ,,ftof&#39;&#39; nie zawiera palindromu o długości co najmniej dwa.</p>

<p>Pojawił się pewien problem. Ponieważ Jasio nie potrafi jeszcze za dobrze czytać, nie odr&oacute;żnia literki ,,i&#39;&#39; od literki ,,j&#39;&#39;, a także nie rozr&oacute;żnia literek ,,p&#39;&#39;, ,,b&#39;&#39; oraz ,,d&#39;&#39;. Gdy w wyrazie pojawi się literka ,,i&#39;&#39; lub ,,j&#39;&#39;, Jasio traktuje je tak, jakby to był ten sam znak. To samo dotyczy ,,p&#39;&#39;, ,,b&#39;&#39; i ,,d&#39;&#39;. W związku z tym Jasio uzna za palindrom r&oacute;wnież słowo ,,pod&#39;&#39;.</p>

<p>Potrzebny jest program, kt&oacute;ry pomoże zweryfikować rozwiązanie, kt&oacute;re podał mały Jasio.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta listę sł&oacute;w do przetworzenia,</li>
	<li>obliczy liczbę sł&oacute;w na wejściu, kt&oacute;re zawierają w sobie jakikolwiek palindrom o długości większej niż jeden znak,</li>
	<li>obliczy liczbę sł&oacute;w na wejściu, kt&oacute;re Jasio uznałby za zawierające jakikolwiek palindrom o&nbsp;długości większej niż jeden znak,</li>
	<li>wypisze obie liczby.</li>
</ul>

### 입력

<p>W pierwszym wierszu znajduje się jedna liczba naturalna&nbsp;<i>n</i>&nbsp;-- liczba sł&oacute;w do przetworzenia,&nbsp;1 &le;&nbsp;<i>n</i> &le;&nbsp;10&nbsp;000. Następnie znajduje się&nbsp;<i>n</i>&nbsp;wierszy, z kt&oacute;rych każdy zawiera dokładnie jedno słowo. Słowa składają się wyłącznie z małych liter alfabetu angielskiego. Długość żadnego słowa nie przekracza&nbsp;200&nbsp;znak&oacute;w.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać dokładnie dwa wiersze, każdy zawierający jedną liczbę całkowitą. Wiersz pierwszy powinien zawierać liczbę sł&oacute;w zawierających palindrom o&nbsp;długości co najmniej dw&oacute;ch znak&oacute;w, natomiast wiersz drugi wynik, kt&oacute;ry uzyskał mały Jasio.</p>