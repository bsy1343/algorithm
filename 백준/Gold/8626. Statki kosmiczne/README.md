# [Gold V] Statki kosmiczne - 8626

[문제 링크](https://www.acmicpc.net/problem/8626)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 16, 맞힌 사람: 16, 정답 비율: 66.667%

### 분류

이분 탐색, 두 포인터

### 문제 설명

<p>Generałowie sił powietrznych Bajtocji: Bajtek, Kajtek i Zajtek zamierzają przeprowadzić pierwszą w historii Bajtocji wielką wyprawę kosmiczną. Każdy z nich zgromadził już pewną ilość paliwa rakietowego i właśnie szykują się na zakup moduł&oacute;w, z kt&oacute;rych złożą rakietę. Bajtockie rakiety są skonstruowane w ten spos&oacute;b, że w początkowym fragmencie lotu są napędzane tylko przez pierwszy moduł, po zużyciu się paliwa w tym module zostaje on odrzucony i odtąd napędu rakiecie dostarcza drugi moduł itd.</p>

<p>Każdy z generał&oacute;w odwiedzi dzisiaj swoją ulubioną fabrykę i zakupi moduł z silnikiem rakietowym o pewnej sprawności; z tych trzech moduł&oacute;w ustawionych w ustalonej kolejności (Bajtek kupuje dolny, Kajtek - środkowy, a Zajtek - g&oacute;rny) zostanie złożona rakieta. Maksymalny zasięg tej rakiety (tj. największa odległość, na jaką może ona dolecieć) będzie r&oacute;wny sumie zasięg&oacute;w poszczeg&oacute;lnych moduł&oacute;w, z kt&oacute;rych każdy jest wyrażony jako iloczyn sprawności silnika oraz objętości zatankowanego do modułu paliwa.</p>

<p>Ze względu na wzrastające ceny w fabrykach, generałowie być może nie zakupią moduł&oacute;w o największych sprawnościach. Chcieliby więc poznać liczbę r&oacute;żnych tr&oacute;jek moduł&oacute;w, kt&oacute;re mogą zakupić (każdy generał po jednym module ze swojej fabryki), takich że złożona z nich rakieta będzie miała zasięg większy niż połowa zasięgu najlepszej rakiety, jaka mogłaby powstać przy aktualnym asortymencie fabryk, tj. gdyby każdy generał kupił najsprawniejszy moduł. R&oacute;żne moduły o tych samych sprawnościach są przy zliczaniu uznawane za r&oacute;żne.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia asortymenty fabryk, kt&oacute;re odwiedzą generałowie oraz ilości paliwa rakietowego, jakie posiadają,</li>
	<li>obliczy liczbę tr&oacute;jek moduł&oacute;w spełniających wymogi Bajtka, Kajtka i Zajtka,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajdują się trzy liczby całkowite $b$, $k$&nbsp;oraz $z$&nbsp;($1 &le; b, k, z &le; 1\,000\,000\,000$), pooddzielane pojedynczymi odstępami i oznaczające objętości paliwa posiadane odpowiednio przez Bajtka, Kajtka i Zajtka. Dalej następują opisy fabryk odwiedzonych przez generał&oacute;w (pierwsza to fabryka odwiedzona przez Bajtka, druga - przez Kajtka, a trzecia - przez Zajtka). Każdy opis składa się z dw&oacute;ch wierszy. W pierwszym z nich znajduje się jedna liczba całkowita $1 &le; n_i &le; 1000$&nbsp;(dla $i \in \{1,2,3\}$), oznaczająca liczbę moduł&oacute;w dostępnych w fabryce. Drugi i jednocześnie ostatni wiersz opisu fabryki składa się z $n_i$&nbsp;pooddzielanych pojedynczymi odstępami liczb całkowitych dodatnich nie większych od $1\,000\,000\,000$, oznaczających sprawności poszczeg&oacute;lnych moduł&oacute;w z fabryki.</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia Tw&oacute;j program powinien wypisać liczbę możliwych do stworzenia rakiet, kt&oacute;rych zasięg będzie&nbsp;<b>większy</b>&nbsp;od połowy maksymalnego zasięgu.</p>

### 힌트

<p>Maksymalny możliwy zasięg rakiety to $27 = 2 \cdot 3 + 3 \cdot 5 + 3 \cdot 2$, więc szukamy tr&oacute;jek moduł&oacute;w o zasięgu większym niż $13, 5$. Są to: $(1, 5, 2)$, $(3,1,2)$, $(3,1,2)$, $(3,5,2)$, o odpowiadających im zasięgach: $23$, $15$, $15$, $27$.</p>