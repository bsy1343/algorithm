# [Gold II] Kuulujutud - 29838

[문제 링크](https://www.acmicpc.net/problem/29838)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

자료 구조, 분리 집합

### 문제 설명

<p>Informaatikaol&uuml;mpiaadi tulevase l&otilde;ppvooru kohta on liikvel igasuguseid kuulujutte. Kuulujutud levivad igasugustes suhtlusringides: klassis, trennis, s&otilde;pruskonnas. Igal kuulujutul on algataja, kes r&auml;&auml;gib seda k&otilde;igis oma suhtlusringides. Kui keegi mingit kuulujuttu kuuleb, r&auml;&auml;gib ta seda omakorda edasi k&otilde;igis oma suhtlusringides (nii, et k&otilde;ik ringis olijad kuulevad seda), k&otilde;ik kuulnud omakorda k&otilde;igis oma suhtlusringides ja nii edasi.</p>

<p>Koolis on kokku $N$ &otilde;pilast, kellest on moodustunud $M$ suhtlusringi. &Otilde;pilased on nummerdatud $1$ kuni $N$ ja iga suhtlusringi kohta on teada sellesse kuuluvate &otilde;pilaste numbrid. Koolis on kokku liikvel $K$ kuulujuttu, millest iga kohta on teada selle algatanud &otilde;pilase number.</p>

<p>Sinu &uuml;lesanne on iga kuulujutu kohta leida, mitu inimest sellest l&otilde;puks kuulevad.</p>

### 입력

<p>Sisendi esimesel real on 3 t&uuml;hikutega eraldatud t&auml;isarvu $N$ ($1 \le N \le 100\,000$), $M$ ($1 \le M \le 100\,000$) ja $K$ ($1 \le K \le 100\,000$).</p>

<p>J&auml;rgmised $M$ rida kirjeldavad suhtlusringe. Iga rea alguses on t&auml;isarv $S_i$ ($1 \le S_i \le N$, &uuml;he suhtlusringi suurus. Sellele j&auml;rgnevad $S_i$ paarikaupa erinevat t&auml;isarvu l&otilde;igust $1$ kuni $N$, selle suhtlusringi liikmete numbrid. On teada, et summa $S_1 + S_2 + \ldots + S_M$ ei &uuml;leta $200\,000$.</p>

<p>J&auml;rgmisel $K$ real on igal &uuml;ks t&auml;isarv l&otilde;igust $1$ kuni $N$, mis annab &uuml;he kuulujutu algataja numbri.</p>

### 출력

<p>V&auml;ljundisse v&auml;ljastada $K$ rida, millest igal on vastava kuulujutu kuuljate arv.</p>