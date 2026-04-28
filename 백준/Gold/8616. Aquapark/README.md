# [Gold III] Aquapark - 8616

[문제 링크](https://www.acmicpc.net/problem/8616)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 10, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

누적 합

### 문제 설명

<p>Nowy dyrektor Bajtockiego Aquaparku zbiera informacje o swoich pracownikach. Chce sprawdzić, kt&oacute;rzy ratownicy są najbardziej pracowici, a kt&oacute;rzy z nich lenią się podczas pracy. Pracowitość ratownika jest ściśle zależna od liczby dzieci, kt&oacute;rych pilnuje, ponieważ bardziej pracowici ratownicy wybierają miejsca, w kt&oacute;rych kąpie się wiele dzieci, natomiast leniwi stronią od nich.</p>

<p>Cały Aquapark ma kształt kwadratu o boku długości $n$&nbsp;i jest podzielony na $n^2$&nbsp;segment&oacute;w w kształcie kwadratu o boku długości 1. Każdy z segment&oacute;w może być albo basenikiem, albo alejką między basenikami. W każdym baseniku kąpie się pewna liczba dzieci.</p>

<p>W Aquaparku rozmieszczonych jest $r$&nbsp;punkt&oacute;w, w kt&oacute;rych znajdują się ratownicy. Ratownik, według najnowszych zasad bezpieczeństwa, może poruszać się jedynie r&oacute;wnolegle do ścian Aquaparku, bez względu na to, czy porusza się po alejkach, czy płynie w baseniku. Stąd odległość, jaką przebędzie między dwoma punktami $(x_1, y_1)$, $(x_2, y_2)$, wynosi zawsze $|x_1 - x_2| + |y_1 - y_2|$. Każdy ratownik ma określony obszar, kt&oacute;ry musi chronić. Dla $i$-tego ratownika są to wszystkie baseniki położone w odległości nie większej niż $l_i$&nbsp;od jego pozycji początkowej.</p>

<p>Chcielibyśmy poznać pracowitość każdego ratownika.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się dwie liczby całkowite $n$&nbsp;oraz $r$&nbsp;($1 &le; n &le; 1\,000$, $1 &le; r &le; n^2$), oddzielone pojedynczym odstępem i oznaczające odpowiednio długość boku Aquaparku oraz liczbę ratownik&oacute;w.</p>

<p>W następnych $n$&nbsp;wierszach znajduje się mapa Aquaparku. W $i$-tym spośr&oacute;d nich znajduje się opis $i$-tego rzędu segment&oacute;w aquaparku, składający się z $n$&nbsp;liczb całkowitych nieujemnych $a_{i,1}, a_{i,2}, \dots , a_{i,n}$&nbsp;($0 &le; a_{i,j} &le; 10^6$), pooddzielanych pojedynczymi odstępami. Jeżeli liczba $a_{i,j}$&nbsp;jest zerem, to znaczy, że segment o wsp&oacute;łrzędnych ($i$, $j$) jest alejką. Jeżeli natomiast jest ona dodatnia, to oznacza, że segment ten jest basenikiem, w kt&oacute;rym kąpie się&nbsp;$a_{i,j}$&nbsp;dzieci.</p>

<p>W każdym z $r$&nbsp;następnych wierszy znajduje się opis jednego ratownika. Opis ten składa się z trzech liczb całkowitych $x_i$, $y_i$&nbsp;oraz $l_i$&nbsp;($1 &le; x_i , y_i &le; n$, $1 &le; l_i &le; n$), pooddzielanych pojedynczymi odstępami, oznaczających odpowiednio wsp&oacute;łrzędne (wiersz, kolumna) miejsca $i$-tego ratownika oraz maksymalną odległość chronionych przez niego basenik&oacute;w.</p>

<p>Możesz założyć, że w 50% przypadk&oacute;w testowych każdy basenik jest chroniony przez co najwyżej jednego ratownika.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście dokładnie $r$&nbsp;wierszy. W $i$-tym wierszu powinna znaleźć się dokładnie jedna liczba całkowita $p_i$&nbsp;oznaczająca liczbę dzieci pilnowanych przez $i$-tego ratownika.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8616.%E2%80%85Aquapark/363dc9d2.png" data-original-src="https://upload.acmicpc.net/a940ef60-61ed-47df-ba1e-c8a8ca5adf27/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>