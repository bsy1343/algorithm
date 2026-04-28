# [Platinum II] Bandżo - 8251

[문제 링크](https://www.acmicpc.net/problem/8251)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 7, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

자료 구조, 세그먼트 트리, 스위핑, 느리게 갱신되는 세그먼트 트리, 값 / 좌표 압축

### 문제 설명

<p>Pewnego dnia Bajtazar udał się na rynek w Bajtogrodzie, aby zagrać na bandżo. Żeby nie uprzykrzać zbytnio życia okolicznym mieszkańcom, postanowił, że zagra tylko dwie kr&oacute;tkie, jednominutowe piosenki. Mimo tego, Bajtazar bardzo chciał, by usłyszało go jak najwięcej os&oacute;b. Zagrał więc jedną piosenkę, nieco odczekał, po czym zagrał drugą. Teraz zastanawia się, czy przypadkiem jego występu nie mogło usłyszeć więcej os&oacute;b.</p>

<p>W ciągu dnia przez rynek przewinęło się <em>n</em>&nbsp;os&oacute;b, kt&oacute;re będziemy numerować od 1&nbsp;do <em>n</em>. Bajtazar dokładnie zapamiętał, kto i kiedy przyszedł na rynek. Osoba numer <em>i</em>&nbsp;pojawiła się na rynku dokładnie na początku <em>p<sub>i</sub></em>-tej minuty (licząc od świtu) i opuściła rynek na początku <em>k<sub>i</sub></em>-tej minuty.</p>

<p>Bajtazar chciałby obliczyć, ile maksymalnie os&oacute;b usłyszałoby jego granie, gdyby rozpoczynał występy w optymalnych momentach. Problem ten przer&oacute;sł jednak jego umiejętności rachunkowe, gdyż dzień w Bajtocji trwa 10<sup>9</sup>&nbsp;minut. Zrozpaczony Bajtazar poprosił Cię o pomoc.</p>

<p>Zakładamy, że Bajtazar gra dokładnie dwa razy, za każdym razem po jednej minucie. Każdy występ może się zacząć o dowolnej porze. W szczeg&oacute;lności druga piosenka może rozpocząć się od razu po zakończeniu pierwszej. Dana osoba słyszy występ, jeśli znajduje się na rynku w trakcie całej minuty, podczas kt&oacute;rej Bajtazar gra.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 500 000) oznaczająca liczbę os&oacute;b, kt&oacute;re przyszły na rynek w ciągu dnia. Każdy z kolejnych <em>n</em>&nbsp;wierszy opisuje jedną z os&oacute;b. W <em>i</em>-tym z tych wierszy znajdują się dwie liczby całkowite <em>p<sub>i</sub></em>&nbsp;oraz&nbsp;<em>k<sub>i</sub></em>&nbsp;(1 &le; <em>p<sub>i</sub></em> &le; <em>k<sub>i</sub></em> &le; 10<sup>9</sup>), kt&oacute;re oznaczają, że osoba numer <em>i</em>&nbsp;przyszła na rynek na początku minuty&nbsp;<em>p<sub>i</sub></em>, a poszła na początku minuty&nbsp;<em>k<sub>i</sub></em>.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście maksymalną liczbę r&oacute;żnych os&oacute;b, kt&oacute;re mogą usłyszeć występy Bajtazara na bandżo.</p>

### 힌트

<p>Bajtazar rozpoczyna pierwszą piosenkę w dowolnym momencie czwartej lub na początku piątej minuty. Pierwszą piosenkę słyszą więc osoby 1, 2&nbsp;i 4. Drugą piosenkę Bajtazar gra w dziewiątej minucie, gdy na rynku są osoby 2, 3&nbsp;i 7. Łącznie Bajtazara słyszy 5&nbsp;r&oacute;żnych os&oacute;b.</p>