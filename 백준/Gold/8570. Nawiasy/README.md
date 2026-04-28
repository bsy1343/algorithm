# [Gold III] Nawiasy - 8570

[문제 링크](https://www.acmicpc.net/problem/8570)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 33, 정답: 21, 맞힌 사람: 18, 정답 비율: 60.000%

### 분류

자료 구조, 스택

### 문제 설명

<p><i>Wyrażeniem nawiasowym</i>&nbsp;nazwiemy niepusty ciąg składający się z nawias&oacute;w otwierających i zamykających. Powiemy, że wyrażenie nawiasowe jest&nbsp;<i>poprawne</i>, jeżeli każdy nawias otwierający można sparować z nawiasem zamykającym, występującym po nim, tak aby ciąg nawias&oacute;w znajdujących się pomiędzy nimi r&oacute;wnież był poprawnym ciągiem nawiasowym.</p>

<p>Na przykład&nbsp;<code>(()())()</code>&nbsp;jest poprawnym wyrażeniem nawiasowym, ale&nbsp;<code>)(</code>&nbsp;i&nbsp;<code>()(</code>&nbsp;już poprawne nie są.</p>

<p>Bajtazar w swojej pracy naukowej skorzystał z programu wypisującego pewne poprawne wyrażenie nawiasowe $S$, mające kluczowe znaczenie dla jego badań. Niestety, słowo to zaginęło w gąszczu innych nawias&oacute;w, kt&oacute;re przez przypadek mogły być wypisane zar&oacute;wno przed nim, jak i po nim. Bajtazar otrzymał więc słowo nawiasowe, kt&oacute;re zawiera w sobie jako sp&oacute;jny fragment szukane słowo $S$, jednak nie wie, gdzie się ono zaczyna i gdzie kończy.</p>

<p>Zrozpaczony, poprosił Ciebie o pomoc w wyznaczeniu wszystkich możliwych położeń poprawnych sł&oacute;w nawiasowych w otrzymanym słowie. Ma bowiem nadzieję, że jest ich niewiele ...</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą $n$&nbsp;($1 &le; n &le; 2\,000\,000$), oznaczającą długość słowa, kt&oacute;re odczytał Bajtazar. W drugim wierszu znajduje się $n$&nbsp;nawias&oacute;w (bez odstęp&oacute;w) - jest to odczytane słowo nawiasowe.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście jedną liczbę całkowitą oznaczającą liczbę fragment&oacute;w odczytanego słowa, kt&oacute;re są poprawnymi słowami nawiasowymi.</p>