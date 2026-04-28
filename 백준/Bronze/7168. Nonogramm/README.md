# [Bronze II] Nonogramm - 7168

[문제 링크](https://www.acmicpc.net/problem/7168)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 150, 정답: 116, 맞힌 사람: 99, 정답 비율: 75.000%

### 분류

구현

### 문제 설명

<p>Nonogramm on m&otilde;istatus, mille lahendaja peab taastama ruudustikus mustadest ja valgetest ruutudest moodustatud kujundi. Ruudustiku iga rea ees on arvud, mis n&auml;itavad j&auml;rjestikustest mustadest ruutudest koosnevate ja valgete ruutudega eraldatud plokkide pikkusi ja nende j&auml;rjekorda. Samamoodi ka veergude kohal. Igal real ja igas veerus peavad n&auml;idatud pikkustega mustad plokid olema n&auml;idatud j&auml;rjekorras ja kahe musta ploki vahel peab alati olema v&auml;hemalt uks valge ruut.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/7168.%E2%80%85Nonogramm/4a9e01e1.png" data-original-src="https://upload.acmicpc.net/95324ff3-b69e-4a8a-a3df-b47cc265db17/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 137px; height: 119px;" /></p>

<p>Kirjutada programm, mis aitab mõistatuse koostajal antud kujundile vastavad ridade ja veergude kirjeldused leida.</p>

### 입력

<p>Tekstifaili esimesel real on kaks täisarvu, ruudustiku ridade arv N (1 &le; N &le; 100) ja veergude arv M (1 &le; M &le; 100). Järgmisel N real on iga&uuml;hel t&auml;pselt M märki, kus punkt tähistab valget ja trellimärk musta ruutu.</p>

### 출력

<p>Tekstifaili väljastada täpselt N +M rida. Esimesele N reale väljastada ruudustiku ridade ees olevad arvud: ruudustiku esimese rea ees olevad arvud faili reale 1, teise rea ees olevad arvud faili reale 2 j.n.e. Järgmisele M reale väljastada veergude kohal olevad arvud: vasakpoolseima veeru kohal olevad arvud faili reale N + 1, vasakult teise veeru kohal olevad arvud faili reale N + 2 j.n.e. Kui ruudustiku mõnes reas või veerus pole &uuml;htki musta ruutu, siis väljastada faili vastavale reale arv 0.</p>