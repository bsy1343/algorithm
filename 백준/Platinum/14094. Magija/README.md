# [Platinum III] Magija - 14094

[문제 링크](https://www.acmicpc.net/problem/14094)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

많은 조건 분기, 다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Mirko je zamislio supertajni prirodan broj X koji u sebi skriva tajnu upravljanja svemirom. Njegov najbolji prijatelj Slavko opijen je moći i želi se domoći toga broja. Tijekom kasnonoćnog prekopavanja Mirkovih ladica, nai&scaron;ao je na papirić na kojem je obja&scaron;njeno da je suma broja X i njemu zrcalnog broja točno Y. Zrcalni broj od X tvorimo tako da unatrag zapi&scaron;emo njegove dekadske znamenke. Tako je primjerice zrcalni broj od 123 jednak 321, dok je zrcalni broj od 520 jednak 25.</p>

<p>Za zadani broj Y izračunajte koliko prirodnih brojeva X zadovoljava gornju konstrukciju.</p>

### 입력

<p>U prvom retku nalazi se T (1 &le; T &le; 500), broj testnih primjera na koje morate odgovoriti. U svakom od sljedećih T redaka nalazi se po jedan prirodan broj Y (1 &le; Y &le; 10<sup>18</sup>), opisan u tekstu zadatka.&nbsp;</p>

### 출력

<p>Za svaki od T brojeva Y potrebno je ispisati jedan redak: koliko različitih brojeva X generira upravo taj broj Y.</p>

<p>Napomena: rje&scaron;enje za pojedini Y potpuno je neovisno o prethodnim ili sljedećim redcima ulaznih podataka.&nbsp;</p>

### 힌트

<p>10 = 5 + 5<br />
11 = 10 + 1<br />
121 = 110 + 11 = 92 + 29 = 83 + 38 = 74 + 47 = 65 + 56 = 56 + 65 = 47 + 74 = 38 + 83 = 29 + 92&nbsp;</p>