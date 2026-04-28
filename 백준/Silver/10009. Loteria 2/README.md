# [Silver III] Loteria 2 - 10009

[문제 링크](https://www.acmicpc.net/problem/10009)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 17, 맞힌 사람: 14, 정답 비율: 58.333%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 해 구성하기

### 문제 설명

<p>Przedsiębiorstwo Bajtocki Lotek specjalizuje się w przeprowadzaniu gier liczbowych i loterii pieniężnych, wśr&oacute;d kt&oacute;rych największą popularnością cieszy się loteria o nazwie&nbsp;<i>Gra w liczby</i>. R&oacute;wnież Bajtazar postanowił spr&oacute;bować szczęścia w grze.</p>

<p>Kupon do&nbsp;<i>Gry w liczby</i>&nbsp;zawiera <em>n</em>&nbsp;pozycji. Na każdej z nich można zakreślić jedną z liczb 1, ..., <em>k</em>. Poniższy rysunek przedstawia przykładowe wypełnienie kuponu dla <em>n</em> = 10&nbsp;i <em>k</em> = 3:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/3b69b4ce-4cfb-4fcd-8f72-0137bcdb0984/-/preview/" style="width: 451px; height: 140px;" /></p>

<p>Losowanie zwycięzc&oacute;w przeprowadza się przy pomocy maszyny losującej, w kt&oacute;rej znajduje się po <em>n</em>&nbsp;kulek każdego z rodzaj&oacute;w 1, ..., <em>k</em>, co daje łącznie <em>nk</em>&nbsp;kulek. W g&oacute;rnej części maszyny jest rozmieszczonych r&oacute;wnomiernie <em>n</em>&nbsp;otwor&oacute;w o średnicy mniejszej niż średnica kulki. W pewnym momencie losowania włączany jest mechanizm pneumatyczny, kt&oacute;ry powoduje, że do każdego z otwor&oacute;w przyssana zostaje jedna kulka. Wypisując kolejno liczby znajdujące się na wylosowanych kulkach, otrzymuje się ciąg złożony z&nbsp;<em>n</em>&nbsp;liczb, stanowiący wynik losowania. Szczęśliwi właściciele kupon&oacute;w, na kt&oacute;rych zakreślono taki właśnie ciąg liczb, zdobywają nagrodę gł&oacute;wną - milion bajtalar&oacute;w do podziału. Na rysunku przedstawiono wynik losowania, przy kt&oacute;rym powyższy kupon uzyskałby gł&oacute;wną nagrodę.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/795ffc97-8ff6-4586-af9b-84fa416b3ed9/-/preview/" style="width: 545px; height: 88px;" /></p>

<p>Bajtazar nabył kupon i zakreślił na nim&nbsp;<em>n</em>&nbsp;liczb. Zanim jednak zdążył złożyć sw&oacute;j kupon w kolekturze, w mediach pojawił się przeciek, że losowanie w&nbsp;<i>Grze w liczby</i>&nbsp;nie jest do końca uczciwe. Zbadano bowiem, że kulki tego samego rodzaju - czyli z tą samą liczbą - odpychają się i nigdy nie ustawią się przy sąsiednich otworach w trakcie losowania (np. układ kulek przedstawiony na powyższym rysunku nie byłby możliwy).</p>

<p>Bajtazar, dowiedziawszy się o tym, postanowił zmienić ciąg <em>n</em>&nbsp;liczb, kt&oacute;ry wskazał, tak aby żadne dwie kolejne liczby w ciągu nie były takie same. Żeby nie kusić losu, chciałby zmienić możliwie najmniej liczb w swoim ciągu. Pom&oacute;ż Bajtazarowi ustalić, ile liczb musi zmienić.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera dwie liczby całkowite <em>n</em>&nbsp;oraz <em>k</em>&nbsp;(2 &le; <em>n</em>, <em>k</em> &le; 500 000). Drugi wiersz zawiera ciąg <em>n</em>&nbsp;liczb z zakresu {1, ..., <em>k</em>}. W ciągu tym występuje co najmniej jedna para sąsiadujących ze sobą takich samych liczb.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą dodatnią - minimalną liczbę liczb w ciągu, kt&oacute;re trzeba zmienić, tak aby żadne dwie takie same liczby nie występowały w nim obok siebie.</p>