# [Gold II] Walizki - 26729

[문제 링크](https://www.acmicpc.net/problem/26729)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

수학, 그래프 이론, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Zastanawialiście się kiedyś, gdzie trafiają Wasze walizki po zdaniu ich na lotnisku? Tuż za zasłonką, za kt&oacute;rą znikają, znajduje się wielka hala wypełniona skomplikowanym układem platform i taśmociąg&oacute;w, kt&oacute;re odpowiednio sortują bagaże.</p>

<p>Bajtazar jest odpowiedzialny za ocenę projektu owej hali w nowo planowanym lotnisku Bajtszawa-Bitom. Według planu w hali ma znaleźć się n platform, ponumerowanych liczbami całkowitymi od 1 do n. Każda walizka ma początkowo trafiać na pierwszą z nich. Z każdej platformy może wychodzić pewna liczba jednokierunkowych taśmociąg&oacute;w, kt&oacute;re prowadzić będą do platform o ściśle większych numerach. Jeśli z jakiejś platformy nie wychodzi żaden taśmociąg, to walizka po trafieniu na nią zostanie z niej zabrana ręcznie przez personel lotniska i przeniesiona do odpowiedniego samolotu. Jeśli zaś z platformy wychodzą jakieś taśmociągi, to ważna jest ich kolejność &ndash; pierwsza walizka, kt&oacute;ra trafi na taką platformę, opuści ją pierwszym taśmociągiem, druga opuści ją drugim i tak dalej. Gdy walizka opuści platformę ostatnim z taśmociąg&oacute;w z niej wychodzących, to następna walizka zn&oacute;w opuści ją pierwszym, i tak w k&oacute;łko.</p>

<p>Po dostarczeniu walizki na pierwszą platformę jej podr&oacute;ż taśmociągami i odebranie przez personel mają miejsce, zanim na pierwszą platformę trafi następna walizka. Innymi słowy, w każdym momencie taśmociągami podr&oacute;żuje co najwyżej jedna walizka.</p>

<p>Da się zauważyć, że po przyjęciu pewnej liczby walizek układ lotniska &bdquo;zresetuje się&rdquo;, czyli powr&oacute;ci do stanu, w kt&oacute;rym każda platforma z wychodzącymi taśmociągami następną walizkę wypuści pierwszym z nich. Bajtazar zastanawia się, jaka jest minimalna dodatnia liczba walizek, po przetworzeniu kt&oacute;rych układ zresetuje się. Pom&oacute;ż mu i oblicz tę wartość!</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita n (1 &le; n &le; 100), oznaczająca liczbę platform.</p>

<p>W następnych n wierszach znajdują się opisy platform. W i-tym z tych wierszy najpierw znajduje się nieujemna liczba całkowita r<sub>i</sub>, oznaczająca liczbę taśmociąg&oacute;w wychodzących z i-tej platformy. Jeśli r<sub>i</sub> = 0, to z owej platformy walizki odbierane są ręcznie przez personel lotniska. Jeśli zaś r<sub>i</sub> &gt; 0 to dalej, w tym samym wierszu, następuje r<sub>i</sub> liczb całkowitych l<sub>i,1</sub>, l<sub>i,2</sub>, . . . , l<sub>i,r<sub>i</sub></sub> (i &lt; l<sub>i,1</sub> &lt; l<sub>i,2</sub> &lt; . . . &lt; l<sub>i,r<sub>i</sub></sub> &le; n), oznaczających numery platform do kt&oacute;rych prowadzą kolejne taśmociągi wychodzące z i-tej platformy. Walizki opuszczają i-tą platformę taśmociągami zgodnie z kolejnością podaną na wejściu (a zatem w rosnącej kolejności numer&oacute;w docelowych platform).</p>

### 출력

<p>W jedynym wierszu wyjścia powinna znaleźć się jedna liczba całkowita, oznaczająca minimalną dodatnią liczbę walizek, po dostarczeniu kt&oacute;rych na pierwszą platformę układ lotniska zresetuje się.</p>

### 힌트

<p>Wyjaśnienie przykład&oacute;w: Układ platform i taśmociąg&oacute;w w pierwszym teście przykładowym wygląda następująco:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26729.%E2%80%85Walizki/78c0c889.png" data-original-src="https://upload.acmicpc.net/bf24dc65-26df-4f25-9cb0-8405100a868f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 372px; height: 86px;" /></p>

<p>Niżej zobrazowane są trasy, kt&oacute;rymi na swoje docelowe platformy trafiają kolejne walizki:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26729.%E2%80%85Walizki/b1b3f46c.png" data-original-src="https://upload.acmicpc.net/6e4d3569-6a64-4034-ad4e-1e4e7b93ca01/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 632px; height: 319px;" /></p>

<p>Po sześciu walizkach każda platforma zn&oacute;w wypuści następną walizkę pierwszym wychodzącym z niej taśmociągiem, zatem odpowiedzią jest liczba 6.</p>

<p>Układ platform i taśmociąg&oacute;w w drugim teście przykładowym wygląda następująco:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26729.%E2%80%85Walizki/8a82f5f9.png" data-original-src="https://upload.acmicpc.net/f23c33e0-4906-4610-ab6b-7d73700494dc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 146px; height: 38px;" /></p>

<p>Pierwsza walizka zostanie odebrana przez personel lotniska bezpośrednio z pierwszej platformy i nie zmieni niczego, zatem układ będzie zresetowany już po niej.</p>