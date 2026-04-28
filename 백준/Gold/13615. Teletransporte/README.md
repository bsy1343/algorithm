# [Gold II] Teletransporte - 13615

[문제 링크](https://www.acmicpc.net/problem/13615)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 13, 맞힌 사람: 10, 정답 비율: 66.667%

### 분류

분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>A Confedera&ccedil;&atilde;o Gal&aacute;tica instalou um novo sistema de teletransporte em suas naves espaciais. Cada nave recebeu uma cabine de teletransporte, na qual h&aacute; um painel com quatro bot&otilde;es. Cada bot&atilde;o &eacute; rotulado com uma letra diferente A, B, C ou D e com um n&uacute;mero que indica a nave destino para a qual o usu&aacute;rio ser&aacute; transportado, instantaneamente, se o respectivo bot&atilde;o for pressionado (como todos sabem, as naves da Confedera&ccedil;&atilde;o s&atilde;o identificadas por inteiros de 1 a N ).</p>

<p>Para usar o sistema, o usu&aacute;rio deve adquirir um bilhete para cada viagem que deseja realizar (uma viagem corresponde a pressionar um bot&atilde;o). Note que como o n&uacute;mero bot&otilde;es no painel &eacute; pequeno comparado com o n&uacute;mero de naves da Confedera&ccedil;&atilde;o, pode ser necess&aacute;rio que o usu&aacute;rio tenha que comprar um bilhete m&uacute;ltiplo de L viagens para ir de uma dada nave S para uma outra nave T.</p>

<p>Por exemplo, para as naves da figura abaixo, se o usu&aacute;rio est&aacute; na cabine de teletransporte da nave 3 e pressiona o bot&atilde;o B ele &eacute; transportado para a nave 2. Se ele tem um bilhete m&uacute;ltiplo e pressiona novamente o bot&atilde;o B ele &eacute; ent&atilde;o transportado para a nave 1.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13615/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%206.59.13.png" style="height:84px; width:389px" /></p>

<p>Sua tarefa neste problema &eacute;, dados a nave de partida S, a nave de chegada T e o n&uacute;mero de viagens L do bilhete, determinar quantas sequ&ecirc;ncias distintas de L bot&ocirc;es levam o usu&aacute;rio da nave S para a nave T . Por exemplo, para as naves da figura acima, existem quatro sequ&ecirc;ncias distintas de L = 2 bot&ocirc;es que levam um usu&aacute;rio da nave S = 3 para a nave T = 1: CD, DA, AB, e BB.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m dois inteiros N (1 &le; N &le; 100) e L (0 &le; L &lt; 2<sup>30</sup>), indicando respectivamente o n&uacute;mero de naves e o n&uacute;mero de viagens do bilhete. A segunda linha da entrada cont&eacute;m dois inteiros S e T (1 &le; S, T &le; N ), indicando respectivamente a nave de partida e a nave de chegada. Cada uma das N linhas seguintes descreve o painel da cabine de teletransporte de uma nave. A i-&eacute;sima dessas linhas, 1 &le; i &le; N , cont&eacute;m quatro inteiros A, B, C e D (1 &le; A, B, C, D &le; N ), que representam os n&uacute;meros escritos nos quatro bot ̃oes da cabine de teletransporte da nave de n&uacute;mero i.</p>

<p>&nbsp;</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha, contendo um &uacute;nico inteiro, que deve ser igual a r m&oacute;dulo 10<sup>4</sup> , onde r &eacute; o n&uacute;mero de sequ&ecirc;ncias distintas de L bot&otilde;es que levam o usu&aacute;rio da nave S para a nave T.</p>