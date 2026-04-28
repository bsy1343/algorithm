# [Platinum III] Pčele - 14069

[문제 링크](https://www.acmicpc.net/problem/14069)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>Pčele svakog dana pohranjuju med u saće &ndash; mrežu vo&scaron;tanih ćelija koja se sastoji od pravilnih &scaron;esterokuta organiziranih u retke i stupce. Tijekom noći, ličinke pojedu sav med iz saća tako da je na početku svakog dana saće potpuno prazno. Malo je poznata činjenica da pčele ne pohranjuju med u nasumične ćelije, budući da raspored ovisi izravno o tome koje su ćelije sadržavale med prethodnog dana. Celija će, naime, sadržavati med ako i samo ako je broj susjednih ćelija (ne uključujući i promatranu ćeliju) koje su sadržavale med prethodnog dana bio neparan. U suprotnom će ćelija biti prazna.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14069.%E2%80%85P%C4%8Dele/b8fe8b37.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/14069.%E2%80%85P%C4%8Dele/b8fe8b37.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14069/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-02%20%EC%98%A4%ED%9B%84%201.39.11.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:103px; width:512px" /><br />
Ilustracija prvog primjera test podataka</p>

### 입력

<p>U prvom se redu nalaze tri prirodna broja, n, m i k (2 &le; n, m &le; 10, 1 &le; k &le; 2<sup>63</sup> &minus; 1), redom broj redaka i stupaca saća te broj dana.</p>

<p>U idućih se n redaka nalazi po m znakova &rsquo;#&rsquo; (ljestve) i &rsquo;.&rsquo; (točka) koji označuju ima li (ljestve) ili nema (točka) meda u danoj ćeliji saća na početku. Saće je uvijek zadano tako da je prva ćelija prvog retka &ldquo;gore lijevo&rdquo; od prve ćelije drugog retka, kao na slici u tekstu zadatka.</p>

### 출력

<p>Potrebno je ispisati stanje saća nakon k dana u istom formatu u kojem je saće zadano na ulazu.</p>