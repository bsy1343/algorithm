# [Gold IV] KVADRATI - 26364

[문제 링크](https://www.acmicpc.net/problem/26364)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 10, 맞힌 사람: 8, 정답 비율: 47.059%

### 분류

슬라이딩 윈도우, 문자열

### 문제 설명

<p>Dan poslije večere s Josipom, Josip je shvatio da je potro&scaron;io skoro sve novce pa je odlučio sastaviti zadatak za neko informatičko natjecanje kako bi zaradio koju kunu. Ideja mu je na početku zadatka proglasiti N uređenih parova slova posebnim i onda riječ S koju ima dati natjecateljima da otkriju koliko u njoj ima kvadratnih podstringova.</p>

<p>Uzastopni niz od 2*K slova u riječi S, gdje je K neki prirodan broj, koji počinje na poziciji i je kvadratni podstring ako za svaki x od i do i+K-1 vrijedi da je ili uređeni par slova (s[x], s[x+K]) poseban ili uređeni par slova (s[x+K], s[x]) poseban. Na primjer, abcdef je kvadratni podstring u riječi abcdefg ako je (a, d) ili (d, a) poseban i (b, e) ili (e, b) poseban i (c, f) ili (f, c) poseban.</p>

<p>Josipov jedini problem s ovim zadatkom je to &scaron;to ga ne zna rije&scaron;iti pa moli tebe da mu pomogne&scaron;.</p>

### 입력

<p>U prvom retku nalazi se prirodan broj N (1 &le; N &le; 676), broj iz teksta zadatka.</p>

<p>U svakom od sljedećih N redaka nalaze se po dva mala slova engleske abecede, A i B, odvojena razmakom koja predstavljaju uređeni par (A, B). Nijedna dva uređena para neće biti ista.</p>

<p>U zadnjem retku nalazi se riječ S (1 &le; |S| &le; 9000). U riječi S nalazit će se samo mala slova engleske abecede.</p>

### 출력

<p>Ispi&scaron;i koliko ima kvadratnih podstringova u riječi S.</p>

### 힌트

<p>Opis prvog primjera: Kvadratni podstringovi su: ab, abca, bcac, ca, cacc, caccaa, ac, acca, cc, ccaa, ca, caab, aa i ab.</p>