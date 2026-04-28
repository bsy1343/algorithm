# [Silver I] Muzyka pop 2 - 26716

[문제 링크](https://www.acmicpc.net/problem/26716)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 21, 맞힌 사람: 19, 정답 비율: 90.476%

### 분류

수학, 그리디 알고리즘, 비트마스킹

### 문제 설명

<p>Jak być może pamiętacie, Mateusz uwielbia muzykę pop. Właśnie skomponował nowy utw&oacute;r i pozostaje mu tylko ułożyć do niego odpowiednie zakończenie.</p>

<p>Mateusz chce, aby zakończenie jego utworu składało się z pewnego niepustego ciągu nut, gdzie każdą można opisać przez jej głośność, kt&oacute;ra to jest dodatnią liczbą całkowitą. Mateusz może używać nut o dowolnie dużych głośnościach, jednak zadaniem zakończenia jest stopniowe wygaszenie utworu &ndash; z tego względu głośności nut w zakończeniu muszą tworzyć ciąg ściśle malejący.</p>

<p>Jak pewnie wiecie lub pamiętacie, w muzyce pop ważne są dobre bity. Tym razem Mateusz stwierdził, że nuta o głośności x ma moc bitową r&oacute;wną liczbie zapalonych bit&oacute;w w binarnym zapisie liczby x. Biorąc pod uwagę resztę utworu ustalił, że suma mocy bitowych nut w zakończeniu powinna być r&oacute;wna dokładnie n.</p>

<p>Pom&oacute;ż mu i znajdź odpowiedni ciąg głośności nut. Można udowodnić, że zawsze istnieje co najmniej jeden taki ciąg, więc Twoim zadaniem jest znaleźć minimalny leksykograficznie.</p>

<p>Uwaga: M&oacute;wimy, że ciąg liczbowy A jest mniejszy leksykograficznie od ciągu liczbowego B, jeśli na pierwszej pozycji, na kt&oacute;rej te ciągi się r&oacute;żnią, A zawiera liczbę mniejszą od B. Jeśli taka pozycja nie istnieje, to A jest mniejszy leksykograficznie od B, jeśli A jest kr&oacute;tszy od B. Na przykład ciąg [1, 10000000] jest mniejszy leksykograficznie od ciągu [2, 2], ciąg [4, 2, 20, 30, 40] jest mniejszy leksykograficznie od ciągu [4, 2, 100, 1], a ciąg [5, 4, 3, 2] jest mniejszy leksykograficznie od ciągu [5, 4, 3, 2, 1].</p>

### 입력

<p>W jedynym wierszu standardowego wejścia znajduje się jedna liczba całkowita n (1 &le; n &le; 1 000 000), oznaczająca wymaganą sumę mocy bitowych nut w szukanym ciągu.</p>

### 출력

<p>W pierwszym wierszu standardowego wyjścia powinna znaleźć się jedna liczba całkowita k, oznaczająca długość szukanego ciągu.</p>

<p>W drugim wierszu standardowego wyjścia powinno znaleźć się k dodatnich liczb całkowitych &ndash; minimalny leksykograficznie, ściśle malejący ciąg, kt&oacute;rego elementy mają sumarycznie zapalonych dokładnie n bit&oacute;w w zapisie binarnym.</p>

### 힌트

<p>Wyjaśnienie przykład&oacute;w: W pierwszym teście przykładowym innymi poprawnymi ciągami są np. [3, 2], [7] lub [4, 2, 1], jednak ciąg [3, 1] jest możliwie najmniejszy leksykograficznie. Zwr&oacute;ć uwagę, że np. ciągi [1, 3], [3, 1, 0] ani [2, 2, 2] nie są poprawnymi ciągami, ponieważ nie są ściśle malejące albo zawierają niedodatnie elementy.</p>