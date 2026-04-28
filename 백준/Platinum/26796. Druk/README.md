# [Platinum III] Druk - 26796

[문제 링크](https://www.acmicpc.net/problem/26796)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 5, 맞힌 사람: 5, 정답 비율: 26.316%

### 분류

수학, 구현, 그리디 알고리즘, 문자열, 브루트포스 알고리즘, 정수론, 시뮬레이션

### 문제 설명

<p>Drukarz Bajtazar otrzymał zlecenie wydrukowania tabliczki zapisanej tekstem. Litery na tabliczce są rozmieszczone r&oacute;wnomiernie na kratce o wymiarach n&times;m. Bajtazar wykona wydruk za pomocą szablonu drukarskiego będącego paskiem o szerokości r&oacute;wnej szerokości jednego rzędu liter. Wydruk odbędzie się przez (potencjalnie wielokrotne) przykładanie szablonu i rozprysk farby dokładnie nad szablonem, przy czym w momencie wydruku szablon nie może wystawać poza tabliczkę.</p>

<p>Szablon zostanie przygotowany w wersji poziomej i pionowej, przy czym obie wersje muszą zawierać ten sam tekst. Każdą pozycję tabliczki Bajtazar musi wydrukować za pomocą szablonu dokładnie raz. Zauważ, że żadnej z wersji szablonu nie można obracać, żeby litery nie wydrukowały się w spos&oacute;b obr&oacute;cony.</p>

<p>Pom&oacute;ż Bajtazarowi i podaj wszystkie długości szablonu, za pomocą kt&oacute;rych Bajtazar może wydrukować całą tabliczkę.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie dodatnie liczby całkowite n i m, oznaczające odpowiednio liczbę rzęd&oacute;w liter na tabliczce i liczbę liter w każdym rzędzie tabliczki. W i-tym z kolejnych n wierszy znajdzie się m-literowy napis złożony z małych liter alfabetu angielskiego (<code>a&ndash;z</code>), oznaczający docelową zawartość i-tego od g&oacute;ry rzędu tabliczki.</p>

### 출력

<p>Pierwszy wiersz wyjścia powinien zawierać jedną liczbę całkowitą oznaczającą liczbę długości szablonu, kt&oacute;rymi Bajtazar może wydrukować tabliczkę. W drugim wierszu powinny znaleźć się wszystkie te długości, uporządkowane ściśle rosnąco, pooddzielane pojedynczymi odstępami. Jeśli w pierwszym wierszu wyjścia znajdzie się liczba 0, drugi wiersz powinien pozostać pusty.</p>

### 제한

<ul>
	<li>n, m &le; 1000</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26796.%E2%80%85Druk/134d0511.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26796.%E2%80%85Druk/134d0511.png" data-original-src="https://upload.acmicpc.net/69e7dbbc-43e9-47ec-a523-f818aefea07e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 276px; height: 174px;" /></p>