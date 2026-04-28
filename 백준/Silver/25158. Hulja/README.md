# [Silver I] Hulja - 25158

[문제 링크](https://www.acmicpc.net/problem/25158)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 12, 맞힌 사람: 11, 정답 비율: 18.644%

### 분류

그래프 이론, 그리디 알고리즘, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>Tonči je za rođendan dobio veliku ploču s N redaka i M stupaca popunjenu slovima. Donio ju je Vjekoslavi i rekao: &bdquo;Evo ploče, a ti smisli tekst.&rdquo;</p>

<p>Kako bi osmislila tekst, Vjekoslava je na neko polje stavila figuricu te slovo zapisano na tom polju napisala na papir kao početak riječi. Zatim je figuricu određen broj puta pomaknula za jedno polje, uvijek se krećući u nekom od osam smjerova. Dok je pomicala figuricu, na kraj je riječi redom dopisivala sva slova zapisana na poljima koja je figurica posjećivala, pazeći da nikad ne posjeti polje sa slovom koje već ima u riječi.</p>

<p>Vjekoslavin omiljeni broj je D, tako da je pazila i da joj riječ ne prema&scaron;i duljinu D. Ako u nekom trenutku vi&scaron;e nije mogla pomaknuti figuricu, dodavala je slova &lsquo;Z&rsquo; na kraj riječi, sve dok joj riječ nije dostigla duljinu D.</p>

<p>Koja je po abecedi najmanja riječ koju je Vjekoslava mogla sastaviti?</p>

### 입력

<p>U prvom retku nalaze se brojevi N i M (1 &le; N, M &le; 1000), brojevi iz teksta zadatka.</p>

<p>U drugom retku nalazi se broj D (1 &le; D &le; 26), broj iz teksta zadatka.</p>

<p>U sljedećih N redaka nalazi se po M velikih slova engleske abecede koja predstavljaju Tončijevu ploču.</p>

### 출력

<p>U jedini redak treba ispisati traženu riječ iz teksta zadatka.</p>