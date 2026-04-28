# [Silver I] Loteria - 8643

[문제 링크](https://www.acmicpc.net/problem/8643)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 29, 맞힌 사람: 24, 정답 비율: 88.889%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Przedsiębiorstwo Bajtocki Lotek specjalizuje się w przeprowadzaniu gier liczbowych i loterii pieniężnych, wśr&oacute;d kt&oacute;rych największą popularnością cieszy się loteria o nazwie&nbsp;<i>Gra w litery</i>. R&oacute;wnież Bajtazar postanowił spr&oacute;bować szczęścia w grze.</p>

<p>Kupon do&nbsp;<i>Gry w litery</i>&nbsp;zawiera <em>n</em>&nbsp;pozycji. Na każdej z nich można zakreślić jedną z trzech liter: A, B lub C. Poniższy rysunek przedstawia przykładowe wypełnienie kuponu dla <em>n</em> = 10:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/bcb0012e-d022-4b06-8d69-b4b5a6494915/-/preview/" style="width: 250px; height: 76px;" /></p>

<p>Losowanie zwycięzc&oacute;w przeprowadza się przy pomocy maszyny losującej, w kt&oacute;rej znajduje się 3<em>n</em>&nbsp;metalowych kulek trzech rodzaj&oacute;w:&nbsp;<em>n</em>&nbsp;kulek z literą A,&nbsp;<em>n</em>&nbsp;z literą B i&nbsp;<em>n</em>&nbsp;z literą C. W g&oacute;rnej części maszyny jest rozmieszczonych r&oacute;wnomiernie&nbsp;<em>n</em>&nbsp;otwor&oacute;w o średnicy mniejszej niż średnica kulki. W pewnym momencie losowania włączany jest mechanizm pneumatyczny, kt&oacute;ry powoduje, że do każdego z otwor&oacute;w przyssana zostaje jedna kulka. Wypisując kolejno litery znajdujące się na wylosowanych kulkach, otrzymuje się ciąg złożony z&nbsp;<em>n</em>&nbsp;liter, stanowiący wynik losowania. Szczęśliwi właściciele kupon&oacute;w, na kt&oacute;rych zakreślono taki właśnie ciąg liter, zdobywają nagrodę gł&oacute;wną - milion bajtalar&oacute;w do podziału. Na rysunku przedstawiono wynik losowania, przy kt&oacute;rym powyższy kupon uzyskałby gł&oacute;wną nagrodę.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e489327b-92ed-4ae8-87d7-d3f7f4676169/-/preview/" style="width: 300px; height: 46px;" /></p>

<p>Bajtazar nabył kupon i zakreślił na nim&nbsp;<em>n</em>&nbsp;liter. Zanim jednak zdążył złożyć sw&oacute;j kupon w kolekturze, w mediach pojawił się przeciek, że losowanie w&nbsp;<i>Grze w litery</i>&nbsp;nie jest do końca uczciwe. Zbadano bowiem, że kulki tego samego rodzaju - czyli z tą samą literą - odpychają się i nigdy nie ustawią się przy sąsiednich otworach w trakcie losowania (np. układ kulek przedstawiony na powyższym rysunku nie byłby możliwy).</p>

<p>Bajtazar, dowiedziawszy się o tym, postanowił zmienić ciąg&nbsp;<em>n</em>&nbsp;liter, kt&oacute;ry wskazał, tak aby żadne dwie kolejne litery w ciągu nie były takie same. Żeby nie kusić losu, chciałby zmienić możliwie najmniej liter w swoim ciągu. Pom&oacute;ż Bajtazarowi ustalić, ile liter musi zmienić.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(2 &le; <em>n</em> &le; 500 000). Drugi wiersz zawiera ciąg złożony z&nbsp;<em>n</em>&nbsp;znak&oacute;w A, B i/lub C. W ciągu tym występuje co najmniej jedna para sąsiadujących ze sobą takich samych liter.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą dodatnią - minimalną liczbę liter w ciągu, kt&oacute;re trzeba zmienić, tak aby żadne dwie takie same litery nie występowały w nim obok siebie.</p>