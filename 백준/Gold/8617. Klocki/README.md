# [Gold IV] Klocki - 8617

[문제 링크](https://www.acmicpc.net/problem/8617)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 16, 맞힌 사람: 13, 정답 비율: 48.148%

### 분류

다이나믹 프로그래밍, 배낭 문제, 중간에서 만나기

### 문제 설명

<p>Bajtek ma dużo klock&oacute;w, kt&oacute;rymi bardzo lubi się bawić. Niestety, ma do nich tylko jedno pudełko i to tak małe, że nie można zmieścić w nim wszystkich klock&oacute;w.</p>

<p>Bajtek jest bardzo uporządkowanym chłopcem i nie lubi zostawiać bałaganu w swoim pokoju. Dlatego zawsze po zabawie pakuje klocki do pudełka i kładzie pudełko na p&oacute;łce.</p>

<p>Wszystkie klocki mają ten sam rozmiar, więc bez względu na to, ile klock&oacute;w wybierze, zawsze może zapakować ich do pudełka co najwyżej $k$. Chciałby jednak, aby (w miarę możliwości) na podłodze pozostały tylko lekkie klocki, więc zawsze pr&oacute;buje zapakować do pudełka cięższe. Czasem jednak okazuje się, że pudełko jest dla niego zbyt ciężkie, żeby położyć je na p&oacute;łce - Bajtek jest przecież tylko małym chłopcem! Stara się więc zapakować do pudełka klocki o jak największej sumarycznej masie, tak jednak, aby był w stanie je podnieść.</p>

<p>Bajtek ma już dość przepakowywania klock&oacute;w tylko dlatego, że nie ma dość siły, aby podnieść pudełko. Poprosił więc Ciebie o napisanie programu, kt&oacute;ry powie mu, jak optymalnie upakować klocki.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się trzy liczby całkowite $n$, $k$&nbsp;oraz $s$&nbsp;($k &le; n &le; 30$, $1 &le; k &le; 12$, $1 &le; s &le; 1\,000\,000$) pooddzielane pojedynczymi odstępami, oznaczające odpowiednio liczbę wszystkich klock&oacute;w, maksymalną liczbę klock&oacute;w, kt&oacute;re Bajtek może zmieścić w pudełku, oraz siłę Bajtka, tj. maksymalną masę pudełka, jakie może on podnieść.</p>

<p>W drugim wierszu wejścia znajduje się $n$&nbsp;liczb całkowitych $m_i$&nbsp;($1 &le; m_i &le; 1\,000\,000$) pooddzielanych pojedynczymi odstępami, oznaczających masy poszczeg&oacute;lnych klock&oacute;w.</p>

<p>Masę pudełka pomijamy (możesz przyjąć, że jest r&oacute;wna 0).</p>

### 출력

<p>W pierwszym i jedynym wierszu standardowego wyjścia Tw&oacute;j program powinien wypisać jedną liczbę całkowitą $M$, oznaczającą maksymalną masę pudełka załadowanego klockami, kt&oacute;re może podnieść Bajtek.</p>

### 힌트

<p><b>Wyjaśnienie do przykładu:</b>&nbsp;Aby osiągnąć sumaryczną masę 4, Bajtek powinien włożyć do pudełka klocki o masach 1 oraz 3.</p>