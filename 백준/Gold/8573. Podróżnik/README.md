# [Gold V] Podróżnik - 8573

[문제 링크](https://www.acmicpc.net/problem/8573)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 11, 맞힌 사람: 11, 정답 비율: 84.615%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Podr&oacute;żnik Bajtonson wr&oacute;cił właśnie z kolejnej podr&oacute;ży w nieznane. Z oczywistych względ&oacute;w nie m&oacute;gł wspomagać się mapą, więc notował jedynie, w kt&oacute;rą stronę podr&oacute;żuje. Dlatego zawsze po pokonaniu kilometra notował kierunek, w jakim się poruszał -&nbsp;<code>N</code>,&nbsp;<code>S</code>,&nbsp;<code>E</code>&nbsp;lub&nbsp;<code>W</code>&nbsp;(odpowiednio p&oacute;łnoc, południe, wsch&oacute;d lub zach&oacute;d).</p>

<p>Jako że w notesie było niewiele miejsca, podr&oacute;żnik korzystał ze skr&oacute;t&oacute;w np.&nbsp;<code>10 NSSW</code>&nbsp;oznaczało, że Bajtonson 10 razy powt&oacute;rzył sekwencję &quot;1 km na p&oacute;łnoc, 2 km na południe, 1 km na zach&oacute;d&quot;. W miejscu, w kt&oacute;rym kończył dany odcinek trasy (opisany skr&oacute;tem), zaczynał następny.</p>

<p>Po powrocie do domu, podr&oacute;żnik zapragnął narysować mapę swoich podr&oacute;ży. Zdecydował, że każdemu kilometrowi jego podr&oacute;ży będzie odpowiadał jeden centymetr na mapie. Teraz potrzebuje kupić odpowiedni arkusz papieru, nie jest jednak w stanie ocenić, jak dużego arkusza będzie potrzebował. Dlatego poprosił Ciebie, swojego asystenta, o napisanie programu, kt&oacute;ry przetworzy zapiski z podr&oacute;ży i wyznaczy wymiary najmniejszego (pod względem pola powierzchni) arkusza, na kt&oacute;rym zmieści się trasa Bajtonsona.</p>

<p>Oczywiście - jak każda mapa - mapa Bajtonsona musi być prostokątem o bokach r&oacute;wnoległych do osi p&oacute;łnoc-południe i wsch&oacute;d-zach&oacute;d.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą $n$&nbsp;($1 &le; n &le; 1\,000$). W $n$&nbsp;następnych wierszach opisane są kolejne etapy podr&oacute;ży Bajtonsona. W $i$-tym z tych wierszy znajduje się liczba całkowita $k_i$&nbsp;($1 &le; k_i &le; 20\,000$) a po odstępie niepusty ciąg znak&oacute;w złożony z liter&nbsp;<code>N</code>,&nbsp;<code>S</code>,&nbsp;<code>E</code>&nbsp;i&nbsp;<code>W</code>. Taki zapis oznacza, że w ramach $i$-tego etapu Bajtonson $k_i$&nbsp;razy powt&oacute;rzył podaną sekwencję kierunk&oacute;w. Liczba znak&oacute;w&nbsp;<code>N</code>,&nbsp;<code>S</code>,&nbsp;<code>E</code>&nbsp;i&nbsp;<code>W</code>&nbsp;na wejściu nie przekroczy $1\,000\,000$.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście dwie liczby całkowite oddzielone pojedynczym odstępem: wysokość i szerokość najmniejszego arkusza, na kt&oacute;rym zmieści się trasa podr&oacute;żnika, wyrażone w centymetrach. Możesz założyć, że obie liczby będą nie większe niż $1\,000\,000\,000$.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/19eb47b1-005a-4c86-8640-6c7373f4a578/-/preview/" /></p>