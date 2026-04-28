# [Gold III] Ladrilhos - 13591

[문제 링크](https://www.acmicpc.net/problem/13591)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 69, 정답: 55, 맞힌 사람: 52, 정답 비율: 81.250%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>Avelino tem um mosaico em uma das paredes de sua casa. &Eacute; uma mosaico muito antigo, composto por pequenos ladrilhos coloridos. Como &eacute; um mosaico antigo, alguns ladrilhos se soltaram ao longo dos anos formando buracos.</p>

<p>Agora, Avelino quer restaurar o mosaico cobrindo os buracos com novos ladrilhos. Entretanto, para economizar, Avelino quer comprar ladrilhos de uma &uacute;nica cor para tapar os buracos. Em particular, quer comprar ladrilhos de uma das cores originais ou de uma cor ainda n&atilde;o contida no mosaico.</p>

<p>Por ser um mosaico, n&atilde;o se deseja que hajam &aacute;reas muito grandes com a mesma cor. Avelino resolveu que vai escolher a cor dos ladrilhos tentando fazer com que o tamanho da menor &aacute;rea monocrom&aacute;tica seja o menor poss&iacute;vel, para que haja mais detalhes. Veja que pode existir mais de uma cor poss&iacute;vel. Uma &aacute;rea &eacute; monocrom&aacute;tica se todos os ladrilhos nela s&atilde;o da mesma cor. Dois ladrilhos adjacentes fazem parte da mesma &aacute;rea se possuem a mesma cor, e dois ladrilhos s&atilde;o adjacentes se compartilham um lado.</p>

<p>Veja o primeiro caso de exemplo, temos tr&ecirc;s &aacute;reas da cor 1 (uma de tamanho 3 e duas de tamanho 2), uma &aacute;rea da cor 2 (de tamanho 3) e uma &aacute;rea da cor 3 de tamanho 7. Uma resposta poss&iacute;vel seria escolher a cor 2, fazendo com que a menor &aacute;rea monocrom&aacute;tica seja de tamanho 2. Se escolhermos a cor 1 a menor &aacute;rea seria de tamanho 3.</p>

<p>Crie um programa que imprima o tamanho da menor &aacute;rea poss&iacute;vel.</p>

### 입력

<p>A primeira linha cont&eacute;m dois inteiros H e L, a altura e largura do mosaico, respectivamente. Em seguida, H linhas conter&atilde;o cada uma L inteiros, separados por espa&ccedil;o, correspondendo &agrave;s cores dos ladrilhos. Um inteiro 0 corresponde a um buraco e um inteiro i &ne; 0 corresponde a um ladrilho com a i-&eacute;sima cor.</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>1 &le; H,L &le; 200</li>
	<li>1 &le; i &le; 40000</li>
</ul>

### 출력

<p>Seu programa deve produzir uma linha, contendo um inteiro, o tamanho da menor &aacute;rea poss&iacute;vel.</p>