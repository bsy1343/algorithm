# [Gold III] Liczby słownie - 26758

[문제 링크](https://www.acmicpc.net/problem/26758)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 7, 맞힌 사람: 5, 정답 비율: 16.129%

### 분류

많은 조건 분기, 구현, 파싱, 문자열

### 문제 설명

<p>W Bajtockim Banku Bitowym obraca się wielkimi sumami pieniędzy. Niestety, przez drobny błąd w oprogramowaniu zagubiono ostatnio wszystkie salda kont klient&oacute;w. A niewiedza, kto ile ma pieniędzy, może się okazać &ndash; jak podejrzewają najlepsi analitycy &ndash; trochę kłopotliwa w przyszłości. Szczęśliwie jednak Bajtazar, najstarszy pracownik archiwum banku, sporządził zawczasu kopię zapasową, używając sprawdzonych i solidnych metod: zapisał na kartce papieru wszystkie stany kont, i to słownie, a nie w zapisie dziesiętnym. Sytuacja jest krytyczna i trzeba działać szybko. Pom&oacute;ż Bajtazarowi &ndash; napisz program, kt&oacute;ry wczyta stan konta klienta zapisany słownie i wypisze go jako liczbę w systemie dziesiątkowym.</p>

### 입력

<p>W pierwszym (jedynym) wierszu wejścia znajduje się napis określający stan konta.</p>

<p>Napis składa się jedynie z małych liter alfabetu angielskiego. Polskie znaki diakrytyczne (takie jak ę, ą czy &oacute;) zostały zastąpione przez ich angielskie odpowiedniki (ę na e, ą na a, &oacute; na o, itd.). Poszczeg&oacute;lne słowa oddzielone są pojedynczymi odstępami. Długość napisu nie przekracza tysiąca znak&oacute;w.</p>

<p>Możesz założyć, że przed słowem tysiac zawsze będzie podana liczba tysięcy (np. 1017 to <code>jeden tysiac siedemnascie</code>), podobnie przed słowami <code>milion</code> i <code>miliard</code>.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia należy wypisać jedną liczbę całkowitą &ndash; stan konta klienta z wejścia.</p>

<p>Jeżeli napis podany na wejściu nie reprezentuje żadnej całkowitej, dodatniej kwoty lub saldo konta miałoby przekraczać 10<sup>9</sup>, zamiast tego należy wypisać tylko jedno słowo <code>NIE</code>.</p>