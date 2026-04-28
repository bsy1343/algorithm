# [Platinum III] Ecologia - 13614

[문제 링크](https://www.acmicpc.net/problem/13614)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 204, 정답: 30, 맞힌 사람: 12, 정답 비율: 13.636%

### 분류

다이나믹 프로그래밍, 자료 구조, 브루트포스 알고리즘, 정렬, 애드 혹, 집합과 맵, 누적 합, 비트마스킹, 해시를 사용한 집합과 맵, 비트필드를 이용한 다이나믹 프로그래밍, 재귀, 비트 집합

### 문제 설명

<p>O reino da Poliminog&ocirc;nia passou recentemente uma lei ecol&oacute;gica que obriga todas as fazendas a preservar o m&aacute;ximo de &aacute;rvores poss&iacute;vel em uma porcentagem fixa da &aacute;rea da fazenda. Al&eacute;m disso, para que os animais silvestres possam se movimentar livremente, a &aacute;rea preservada deve ser conexa.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13614.%E2%80%85Ecologia/852f4024.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13614.%E2%80%85Ecologia/852f4024.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13614/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%206.55.41.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:137px; width:137px" /></p>

<p>As fazendas na Poliminog&ocirc;nia s&atilde;o sempre um reticulado de N &times; N quadrados de um hectare cada. A figura ao lado ilustra uma fazenda com N = 5. A &aacute;rea preservada deve cobrir exatamente M quadrados. No exemplo da figura, M = 6. Ela deve ser conexa ortogonalmente; quer dizer, tem que ser poss&iacute;vel se movimentar entre quaisquer dois quadrados preservados apenas com movimentos ortogonais entre quadrados preservados. A &aacute;rea n&atilde;o preservada, entretanto, pode ser desconexa.</p>

<p>Os fazendeiros sabem o n&uacute;mero de &aacute;rvores que h&aacute; dentro de cada quadrado e voc&ecirc; deve escrever um programa que calcule o n&uacute;mero m&aacute;ximo poss&iacute;vel de &aacute;rvores que podem ser preservadas com uma area de M quadrados. No exemplo, &eacute; poss&iacute;vel preservar 377 &aacute;rvores!</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m dois inteiros N e M (2 &le; N &le; 50, 1 &le; M &le; 10). As N linhas seguintes cont&ecirc;m, cada uma, N inteiros de valor entre 1 e 1000, representando o n&uacute;mero de &aacute;rvores dentro de cada quadrado da fazenda.</p>

<p>&nbsp;</p>

### 출력

<p>Seu programa deve imprimir uma linha contendo um n&uacute;mero inteiro, o n&uacute;mero m&aacute;ximo de &aacute;rvores que podem ser preservadas, com as restri&ccedil;&otilde;es dadas.</p>