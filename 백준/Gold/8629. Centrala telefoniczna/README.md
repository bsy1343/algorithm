# [Gold IV] Centrala telefoniczna - 8629

[문제 링크](https://www.acmicpc.net/problem/8629)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 9, 맞힌 사람: 9, 정답 비율: 50.000%

### 분류

정렬, 기하학, 누적 합

### 문제 설명

<p>Bajtocka firma telekomunikacyjna Bajtel wkracza na rynek z nową ofertą bezprzewodowych telefon&oacute;w domowych.</p>

<p>Aby umożliwić funkcjonowanie usługi, Bajtel zamierza wybudować centralę telefoniczną z wieżą, kt&oacute;ra będzie zapewniała zasięg sieci bezprzewodowej. Wiadomo już, gdzie ta centrala powstanie, ale nie zostało jeszcze ustalone, jak wysoką wieżę należy zbudować. Im wyższa wieża, tym większy będzie miała zasięg i więcej dom&oacute;w będzie nim obejmować, więc firma będzie mogła mieć więcej abonent&oacute;w, co w oczywisty spos&oacute;b zwiększy jej dochody. Z drugiej strony, wraz ze zwiększaniem wysokości wieży wzrasta koszt jej utrzymania.</p>

<p>Na terenie Bajtocji jest wiele mieszkań, z kt&oacute;rych każde ma kształt wielokąta prostego, czyli łamanej zamkniętej bez samoprzecięć, wierzchołk&oacute;w wielokrotnych i nachodzących na siebie krawędzi. W każdym z nich mieszka jedna rodzina, kt&oacute;ra jest skłonna podpisać z Bajtelem umowę na pewien ustalony miesięczny abonament, jednak tylko pod warunkiem, że firma obejmie swoim zasięgiem całą powierzchnię jej mieszkania.</p>

<p>Miesięczny koszt utrzymania wieży centrali jest zależny od jej wysokości. Każdy bajtometr konstrukcji zwiększa promień kolistego obszaru posiadającego zasięg sieci o $k$&nbsp;bajtometr&oacute;w, jednak jego utrzymanie kosztuje tyle bajtalar&oacute;w, ile metr&oacute;w konstrukcji znajduje się jeszcze nad nim. Wynika to ze względ&oacute;w technicznych - część wieży, kt&oacute;ra znajduje się niżej, musi utrzymywać ciężar całej konstrukcji, kt&oacute;ra znajduje się nad nią, musi więc być szersza, solidniejsza, a przez to droższa w utrzymaniu. Wysokość wieży musi się wyrażać całkowitą liczbą bajtometr&oacute;w.</p>

<p>Znając położenia i kształty wszystkich dom&oacute;w w Bajtocji, kwoty miesięcznego abonamentu, jakie poszczeg&oacute;lne rodziny są gotowe zapłacić oraz liczbę $k$, należy znaleźć maksymalny możliwy do uzyskania zysk firmy Bajtel.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis położeń i kształt&oacute;w dom&oacute;w, kwoty abonamentu deklarowane przez poszczeg&oacute;lne rodziny oraz liczbę $k$,</li>
	<li>wyznaczy maksymalne miesięczne zarobki firmy Bajtel,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite $n$&nbsp;oraz $k$&nbsp;($1 &le; n &le; 100\,000$, $1 &le; k &le; 1\,000\,000$), oddzielone pojedynczym odstępem i oznaczające liczbę dom&oacute;w w Bajtocji oraz wzrost zasięgu wieży (w bajtometrach) na każdy bajtometr jej wysokości.</p>

<p>W każdym z następnych $n$&nbsp;wierszy znajduje się opis jednego mieszkania. Zaczyna się on od dw&oacute;ch liczb całkowitych $m_i$&nbsp;oraz $p_i$&nbsp;($3 &le; m_i &le; 10$, $1 &le; p_i &le; 1\,000\,000\,000$) oznaczających odpowiednio liczbę wierzchołk&oacute;w $i$-tego wielokątnego mieszkania oraz miesięczną kwotę abonamentu w bajtalarach, jaką deklaruje się zapłacić rodzina w nim mieszkająca. Dalej w tym samym wierszu następuje dokładny opis wielokąta. Składa się on z listy całkowitoliczbowych wsp&oacute;łrzędnych $x_{ij}$, $y_{ij}$&nbsp;kolejnych $m_i$&nbsp;wierzchołk&oacute;w wielokąta ($-10^9 &le; x_{ij}, y_{ij} &le; 10^9$). Połączone ze sobą są każde dwa kolejne wierzchołki na liście oraz pierwszy wierzchołek z ostatnim. Wszystkie liczby występujące w opisie pojedynczego mieszkania są pooddzielane pojedynczymi odstępami.</p>

<p>Może się zdarzyć, że pewne dwa mieszkania nachodzą na siebie (jeżeli na przykład znajdują się na r&oacute;żnych piętrach tego samego budynku). Może się r&oacute;wnież zdarzyć, że niekt&oacute;re mieszkania znajdują się pod centralą Bajtela. Miejsce pod budowę wieży centrali ma wsp&oacute;łrzędne $(0,0)$.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać w pierwszym i jedynym wierszu wyjścia jedną liczbę całkowitą będącą maksymalnym miesięcznym zyskiem w bajtalarach, jaki może osiągnąć Bajtel, wybudowawszy odpowiednio wysoką wieżę. Możesz założyć, że dla każdych danych wejściowych istnieje taka całkowitoliczbowa wysokość wieży, przy kt&oacute;rej Bajtel osiągnie dodatni miesięczny zysk.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8629.%E2%80%85Centrala%E2%80%85telefoniczna/234801cc.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8629.%E2%80%85Centrala%E2%80%85telefoniczna/234801cc.png" data-original-src="https://upload.acmicpc.net/ba02429d-7e17-4ca3-b7d7-1f8987ac51ec/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Bajtel osiągnie największy zysk, jeżeli wybuduje wieżę o wysokości $3$&nbsp;bajtometr&oacute;w. Wtedy zasięg wieży wyniesie $3 \cdot 2 = 6$&nbsp;bajtometr&oacute;w. Zysk z mieszkań abonenckich będzie r&oacute;wny $4+5=9$, natomiast koszt utrzymania wieży wyniesie $0+1+2=3$, co daje łączny zysk firmy - $6$&nbsp;bajtalar&oacute;w.</p>