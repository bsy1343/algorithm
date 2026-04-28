# [Gold V] Skrzaty - 8577

[문제 링크](https://www.acmicpc.net/problem/8577)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 8, 맞힌 사람: 8, 정답 비율: 57.143%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 시뮬레이션, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Zły smok Bitol najechał krainę skrzat&oacute;w i wziął w niewolę jej mieszkańc&oacute;w. Przydzielił każdemu z $n$&nbsp;skrzat&oacute;w inne stanowisko pracy i, samemu ległszy na stercie skradzionych kosztowności, jął leniwie nadzorować ich mozolne trudy.</p>

<p>Jako że Bitol jest wyjątkowo gnuśnym smokiem, nie obserwuje jednocześnie wszystkich poddanych. Zamiast tego cały czas przygląda się uważnie tylko skrzatom pracującym przy pewnej grupie stanowisk. W tym czasie wszystkie nieobserwowane przezeń skrzaty mogą spotykać się oraz dowolnie zamieniać się miejscami (Bitol nie jest w stanie zapamiętać, przy kt&oacute;rym stanowisku pracował kt&oacute;ry skrzat). Co godzinę smok obraca głowę i zaczyna obserwować inny podzbi&oacute;r skrzat&oacute;w.</p>

<p>Skrzat Bajtazyl, kt&oacute;remu smok przydzielił stanowisko $1$, chce zmobilizować towarzyszy niedoli do przeciwstawienia się Bitolowi. W tym celu musi najpierw spotkać się z sędziwym skrzatem Bajtomirem, kt&oacute;remu smok przydzielił stanowisko $n$. Przed Bajtazylem stoi zatem wyzwanie: odpowiednio zamieniając się z innymi skrzatami miejscami, winien jak najszybciej doprowadzić do sytuacji, w kt&oacute;rej on sam, ani stanowisko przy kt&oacute;rym stoi aktualnie nasz śmiałek, ani stanowisko $n$&nbsp;nie byłyby obserwowane przez smoka.</p>

<p>Twoim zadaniem jest ustalenie, kiedy najwcześniej może dojść do spotkania. Na szczęście wiadomo, że za $m$&nbsp;godzin smok uśnie i w&oacute;wczas wszystkie skrzaty będą w stanie komunikować się swobodnie.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się dwie liczby całkowite $n$&nbsp;i $m$&nbsp;($1 &le; n, m &le; 1\,000\,000$) oznaczające odpowiednio liczbę skrzat&oacute;w oraz liczbę godzin pozostałych do czasu, aż Bitol zaśnie. W następnych $m$&nbsp;wierszach znajdują się opisy grup stanowisk obserwowanych przez smoka w kolejnych godzinach, po jednym w wierszu. Na opis $i$-tej grupy stanowisk składa się liczba całkowita $k_i$&nbsp;($1 &le; k_i &le; n$) oznaczająca liczbę obserwowanych stanowisk oraz $k_i$&nbsp;uporządkowanych rosnąco liczb całkowitych ze zbioru $\{1, \dots , n\}$&nbsp;oznaczających numery obserwowanych stanowisk. Wszystkie liczby w wierszu poodzielane są pojedynczymi odstępami.</p>

<p>Możesz założyć, że $k_1 + k_2 + \dots + k_m &le; 2\,000\,000$.</p>

### 출력

<p>W pierwszym i jedynym wierszu standardowego wyjścia Tw&oacute;j program powinien wypisać jedną liczbę całkowitą ze zbioru $\{0, \dots ,m\}$&nbsp;- najmniejszą liczbę godzin, po kt&oacute;rej Bajtazyl może dotrzeć do Bajtomira.</p>

### 힌트

<p><b>Wyjaśnienie do przykładu:</b></p>

<p>W pierwszym z powyższych przykład&oacute;w podczas pierwszej godziny swej wyprawy Bajtazyl nie może opuścić stanowiska o numerze $1$, gdyż jest ono obserwowane przez smoka. Podczas drugiej godziny może on zamienić się miejscami ze skrzatem przy stanowisku o numerze $4$. Dzięki temu dopiero na początku trzeciej godziny smok Bitol odwr&oacute;ci głowę ku stanowiskom o numerach $1$, $2$, $3$, a Bajtazyl będzie mogł spotkać się z Bajtomirem.</p>

<p>W drugim z powyższych przykład&oacute;w do spotkania może dojść natychmiast, gdyż w pierwszej godzinie smok nie patrzy na stanowiska Bajtazyla i Bitomira.</p>

<p>W trzecim przykładzie do spotkania może dojść dopiero wtedy, gdy Bitol uśnie.</p>