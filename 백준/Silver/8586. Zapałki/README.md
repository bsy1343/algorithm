# [Silver III] Zapałki - 8586

[문제 링크](https://www.acmicpc.net/problem/8586)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 127, 정답: 52, 맞힌 사람: 39, 정답 비율: 39.000%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Bajtek bawi się zapałkami. Na jednym z końc&oacute;w zapałki znajduje się gł&oacute;wka pokryta masą ułatwiającą zapłon. Bajtek ułożył zapałki w linii prostej jedna obok drugiej, w taki spos&oacute;b, że każdy koniec zapałki sąsiaduje z końcem pewnej innej zapałki, opr&oacute;cz dw&oacute;ch skrajnych zapałek, kt&oacute;re sąsiadują tylko jednym końcem.</p>

<p align="center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/8586.%E2%80%85Zapa%C5%82ki/1a800d8f.png" data-original-src="https://upload.acmicpc.net/2d74a4f6-095f-4807-aba6-ceefb9679a08/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p align="center">Przykładowe ułożenie zapałek.</p>

<p>Bajtek chciałby podpalić pierwszą zapałkę (skrajną z lewej) tak aby wszystkie zapałki spaliły się. Pierwszą zapałkę zapali on przy użyciu zapalniczki, może więc to zrobić bez względu na jej ułożenie. Natomiast między kolejnymi zapałkami ogień przeniesie się tylko, jeśli co najmniej jedna z tych zapałek w miejscu połączenia będzie zwr&oacute;cona gł&oacute;wką. Zastanawiamy się, ile minimalnie zapałek musimy odwr&oacute;cić, aby wszystkie zapałki spaliły się, jeśli podpalimy pierwszą zapałkę.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą $n$&nbsp;($1 &le; n &le; 1\,000\,000$) oznaczającą liczbę zapałek Bajtka. Drugi wiersz opisuje ułożenie kolejnych zapałek - zawiera ciąg $n$&nbsp;liczb całkowitych $x_1, x_2, \dots , x_n$, przy czym $x_i$&nbsp;oznacza zwrot $i$-tej zapałki w ciągu: $0$&nbsp;jeśli gł&oacute;wka zapałki znajduje się z lewej strony, zaś $1$&nbsp;jeśli gł&oacute;wka zapałki znajduje się z prawej strony.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą r&oacute;wną minimalnej liczbie zapałek, jakie należy odwr&oacute;cić.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/8586.%E2%80%85Zapa%C5%82ki/fc9dd0b0.png" data-original-src="https://upload.acmicpc.net/9c1193fd-6bbf-46c9-9adf-87eba70ce54e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>