# [Gold IV] Autostrady - 8549

[문제 링크](https://www.acmicpc.net/problem/8549)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 130, 정답: 106, 맞힌 사람: 89, 정답 비율: 80.180%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>Drogi w Dalekim Kraju są w bardzo złym stanie, ale pozwalają na dotarcie z każdego miasta do dowolnego innego (choć może to wymagać odwiedzenia wielu miast). Żeby temu zaradzić rząd Dalekiego Kraju postanowił wybudować autostrady. Z braku pieniedzy zdecydowano się na budowę najmniejszej możliwej liczby autostrad, kt&oacute;re umożliwią przejazd pomiędzy dwoma dowolnymi miastami. Autostrady mają być zbudowane w miejsce istniejących (wybranych) dr&oacute;g. Znany jest koszt przebudowy każdej drogi. Okazało się, że koszty przebudowy r&oacute;żnych dr&oacute;g są r&oacute;żne. Autostrady mają zbudować prywatne przedsiębiorstwa za pieniądze publiczne. Rząd wie, że opinię społeczną nie tyle interesuje łączny koszt wybudowania wszystkich autostrad, ale to ile zarobią poszczeg&oacute;lne przedsiebiorstwa. Dlatego zdecydowano się na wybudowanie takiej sieci autostrad, żeby koszt najdroższej z nich był jak najmniejszy. Jaki jest koszt budowy najdroższej autostrady przy takim założeniu? Wszystkie drogi i autostrady są dwukierunkowe.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis systemu drogowego w Dalekim Kraju i koszty przebudowy poszczeg&oacute;lnych dr&oacute;g na autostrady,</li>
	<li>obliczy koszt budowy najdroższej autostrady przy założeniu, że wybuduje się ich jak najmniej, zapewniając jednocześnie przejazd autostradami pomiędzy dowolnymi dwoma miastami oraz że koszt budowy najdroższej z nich będzie jak najmniejszy,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu podane są dwie liczby całkowite <em>n</em>, <em>m</em>&nbsp;(2 &le; <em>n</em> &le; 100 000, 1 &le; <em>m</em> &le; 100 000), oddzielone pojedynczym odstępem. Liczba <em>n</em>&nbsp;jest liczbą miast w Dalekim Kraju. Miasta są ponumerowane od 1 do <em>n</em>. Liczba <em>m</em>&nbsp;jest liczbą dr&oacute;g. Każda droga łączy bezpośrednio dwa miasta. Każdy z następnych <em>m</em>&nbsp;wierszy zawiera trzy liczby całkowite opisujące jedną drogę wraz z kosztem jej przebudowy. Liczby oddzielone są pojedynczymi znakami odstępu. Dwie pierwsze liczby są numerami miast, kt&oacute;re ta droga łączy, natomiast trzecia liczba jest kosztem przebudowy drogi na autostradę. Koszt pojedyczej przebudowy jest dodatnią liczbą całkowitą nie większą niż 1 000 000.</p>

### 출력

<p>Pierwszy i jedyny wiersz powinien zawierać koszt budowy najdroższej autostrady przy spełnieniu warunk&oacute;w zadania.</p>