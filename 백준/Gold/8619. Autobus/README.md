# [Gold II] Autobus - 8619

[문제 링크](https://www.acmicpc.net/problem/8619)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 8, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

그래프 이론, 기하학, 최단 경로, 플로이드–워셜

### 문제 설명

<p>W związku z nadchodzącymi wyborami, władze Bajtogrodu postanowiły uruchomić nową linię autobusową.</p>

<p>W Bajtogrodzie jest $n$&nbsp;skrzyżowań oraz $m$&nbsp;jednokierunkowych ulic łączących te skrzyżowania. Każda ulica ma kształt odcinka łączącego dwa skrzyżowania (nie ma na niej żadnych łuk&oacute;w, skręt&oacute;w itd.). Skrzyżowania to jedyne miejsca, gdzie można zjechać z ulicy na inną - jeśli dwie ulice się krzyżują, a nie ma tam skrzyżowania, to prawdopodobnie jedna prowadzi tunelem albo wiaduktem; jeśli natomiast dwie ulice się pokrywają, to prawdopodobnie jedna prowadzi estakadą. Dwa skrzyżowania mogą być połączone przez wiele dr&oacute;g - takie drogi uważane są w&oacute;wczas za r&oacute;żne.</p>

<p>Prace posuwały się na początku szybko - bez problemu ustalono, jaki jest czas przejazdu autobusu przez każdą ulicę (okazało się, że wartość ta wyrażała się dla każdej ulicy parzystą liczbą minut), na kt&oacute;rych ulicach trzeba ustawić przystanki (przystanek zawsze stoi dokładnie w połowie ulicy, czyli od początku ulicy do przystanku autobus jedzie tak samo długo, jak od przystanku do końca ulicy) oraz w jakiej kolejności autobus ma je odwiedzać.</p>

<p>Dalej jednak zaczęły się schody.</p>

<p>Po pierwsze, okazało się, że autobus jest mało zwrotny, i może na skrzyżowaniach wykonywać skręty tylko wtedy, kiedy kąt skrętu jest nie większy niż $90^{\circ}$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8619.%E2%80%85Autobus/0fb35abf.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8619.%E2%80%85Autobus/0fb35abf.png" data-original-src="https://upload.acmicpc.net/b46caea6-e2ca-4c9e-be31-9d91d9c96e5d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Jeżeli autobus jedzie w kierunku zgodnym ze strzałką, to $\alpha$&nbsp;oznacza jego kąt skrętu.</p>

<p>Po drugie, nikt w Bajtogrodzkim Urzędzie Miasta nie potrafi znaleźć optymalnej trasy dla autobusu, minimalizującej czas przejazdu autobusu z pierwszego do ostatniego przystanku. Tw&oacute;j przyjaciel, kt&oacute;ry pracuje w Urzędzie, poprosił Cię o pomoc. Pom&oacute;ż mu ułożyć optymalną trasę! Możemy przyjąć, że autobus w og&oacute;le się nie zatrzymuje na przystankach (z dodaniem czasu na post&oacute;j urzędnicy już sobie poradzą), lecz wystarczy, jeżeli przejedzie koło każdego z nich.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis Bajtogrodu oraz zamierzonych przystank&oacute;w,</li>
	<li>wyznaczy optymalną trasę autobusu,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>Pierwszy wiersz wejścia zawiera trzy liczby całkowite $n$, $m$&nbsp;i $p$&nbsp;($3 &le; n &le; 50$, $2 &le; m &le; 500$, $2 &le; p &le; 100$), pooddzielane pojedynczymi odstępami - liczbę skrzyżowań w Bajtogrodzie, liczbę ulic i liczbę zamierzonych przystank&oacute;w.</p>

<p>Kolejne $n$&nbsp;wierszy opisuje skrzyżowania. W $i+1$-szym wierszu wejścia znajdują się dwie liczby całkowite $x_i$&nbsp;i $y_i$&nbsp;($-10\,000 &le; x_i, y_i &le; 10\,000$), oddzielone pojedynczym odstępem - wsp&oacute;łrzędne $i$-tego skrzyżowania. Skrzyżowania są ponumerowane od $1$&nbsp;do $n$.</p>

<p>Następne $m$&nbsp;wierszy zawiera informacje o kolejnych ulicach. W $n+i+1$-szym wierszu znajdują się trzy liczby całkowite - $a_i$, $b_i$&nbsp;oraz $t_i$&nbsp;($1 &le; a_i, b_i &le; n$, $a_i \ne b_i$, $1 &le; t_i &le; 5\,000$), pooddzielane pojedynczymi odstępami. Oznaczają one, że $i$-ta ulica prowadzi ze skrzyżowania $a_i$&nbsp;do $b_i$&nbsp;i czas przejazdu po tej ulicy wynosi $2 \cdot t_i$. Ulice są ponumerowane od $1$&nbsp;do $m$.</p>

<p>W kolejnych $p$&nbsp;wierszach znajduje się po jednej liczbie całkowitej; w wierszu $n+m+i+1$-szym znajduje się $e_i$&nbsp;($1 &le; e_i &le; m$) - numer ulicy, przy kt&oacute;rej ma się znaleźć $i$-ty przystanek. Numery ulic mogą się powtarzać - jeśli $e_i = e_j$, to oznacza, że po odwiedzeniu przystank&oacute;w na ulicach $e_1, e_2, \dots, e_i , \dots , e_{j-1}$&nbsp;autobus ma wr&oacute;cić na przystanek przy ulicy $e_j$. W szczeg&oacute;lności, jeżeli $e_i = e_{i+1}$, to autobus powinien odjechać z przystanku $e_i$, a następnie wr&oacute;cić do niego.</p>

### 출력

<p>Jeśli nie istnieje trasa spełniająca wymogi Urzędu, to należy wypisać tylko jedno słowo&nbsp;<code>NIE</code>. W przeciwnym przypadku należy wypisać $p-1$&nbsp;wierszy. W $i$-tym wierszu powinien się znaleźć czas przyjazdu autobusu na $i+1$-szy przystanek (licząc od odjazdu z przystanku pierwszego), przy założeniu, że autobus jedzie optymalną trasą.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8619.%E2%80%85Autobus/259b49fb.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8619.%E2%80%85Autobus/259b49fb.png" data-original-src="https://upload.acmicpc.net/82872051-6b26-40c5-a3f3-e1f81a505c87/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Na rysunku k&oacute;łkami oznaczono skrzyżowania, a kwadratami - przystanki. Cienkimi kreskami oznaczono ulice, natomiast grubą - najlepszą możliwą trasę z pierwszego przystanku na drugi, czyli pierwszy fragment optymalnej trasy autobusu. Dla uproszczenia na rysunku pominięto czasy przejazdu przez poszczeg&oacute;lne ulice.</p>