# [Gold III] Mur - 8615

[문제 링크](https://www.acmicpc.net/problem/8615)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 8, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

기하학, 다각형의 넓이

### 문제 설명

<p>Kr&oacute;l Bajtocji zaobserwował w ostatnim czasie znaczny spadek dochod&oacute;w miast czerpanych z podatk&oacute;w. Podejrzewa, że ma to związek z pojawieniem się w miastach nowych, nieuczciwych sprzedawc&oacute;w, kt&oacute;rzy najprawdopodobniej w nocy przechodzą przez mury miast, przemycając r&oacute;żne produkty.</p>

<p>Kr&oacute;l postanowił zatrudnić wszystkowidzącego Jacka, aby nocami wdrapywał się na wieże kościoł&oacute;w i obserwował granice miast. Jednak teraz zastanawia się, czy to wystarczy. Nie jest bowiem pewien, czy w każdym mieście wszystkowidzący Jacek może zobaczyć z wieży kościoła każdy kawałek muru. Co prawda wszystkowidzący Jacek widzi dookoła głowy i przez wszystkie budynki w mieście, jednak nie może zobaczyć części muru zasłoniętej przez inny fragment muru. Nie może r&oacute;wnież zobaczyć fragmentu muru, kt&oacute;ry cały leży na linii jego wzroku, ponieważ fragment ten jest w&oacute;wczas zasłaniany przez jeden z wierzchołk&oacute;w.</p>

<p>Granica każdego miasta ma kształt wielokąta. Mur żadnego miasta nie posiada samoprzecięć, zaś kości&oacute;ł nie może znajdować się ani na nim, ani poza granicami swojego miasta.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita $m$&nbsp;($1 &le; m &le; 10$), oznaczająca liczbę miast. W następnych wierszach znajdują się opisy kolejnych miast.</p>

<p>Pierwszy wiersz opisu każdego miasta zawiera trzy liczby całkowite $n$, $x$&nbsp;oraz $y$&nbsp;($3 &le; n &le; 100\,000$, $-1\,000\,000\,000 &le; x, y &le; 1\,000\,000\,000$) pooddzielane pojedynczymi odstępami, oznaczające odpowiednio liczbę wierzchołk&oacute;w muru w tym mieście oraz wsp&oacute;łrzędne kościoła. W każdym z następnych $n$&nbsp;wierszy opisu miasta znajdują się dwie liczby całkowite $x_i$&nbsp;oraz $y_i$, oddzielone pojedynczym odstępem i oznaczające wsp&oacute;łrzędne $i$-tego wierzchołka muru ($-1\,000\,000\,000 &le; x_i , y_i &le; 1\,000\,000\,000$). Wierzchołki te są podane w kolejności ich występowania na murze. Innymi słowy, każde dwa kolejne wierzchołki oraz pierwszy z ostatnim są połączone fragmentami muru. Możesz założyć, że w testach wartych łącznie 70% punkt&oacute;w zachodzi $n &le; 3\,500$.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście dokładnie $m$&nbsp;wierszy. W $i$-tym wierszu powinno znaleźć się jedno słowo:</p>

<ul>
	<li>&quot;<code>TAK</code>&quot;, jeśli w $i$-tym mieście z wieży kościoła widać cały mur,</li>
	<li>&quot;<code>NIE</code>&quot; w przeciwnym przypadku.</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8615.%E2%80%85Mur/19ed176d.png" data-original-src="https://upload.acmicpc.net/edf41bea-e7b9-4c5f-a2dc-ca5d3d458112/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>