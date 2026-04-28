# [Gold IV] Países em Guerra - 13634

[문제 링크](https://www.acmicpc.net/problem/13634)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 113, 정답: 85, 맞힌 사람: 22, 정답 비율: 56.410%

### 분류

그래프 이론, 최단 경로, 플로이드–워셜

### 문제 설명

<p>No ano 2050, ap&oacute;s diversas tentativas da ONU de manter a paz no mundo, explode a terceira guerra mundial. Segredos industriais, comerciais e militares obrigaram todos os pa&iacute;ses a utilizar servi&ccedil;os de espionagem extremamente sofisticados, de forma que em cada cidade do mundo h&aacute; ao menos um espi&atilde;o de cada pa&iacute;s. Esses espi&otilde;es precisam se comunicar com outros espi&otilde;es, com informantes e mesmo com as suas centrais durante as suas a&ccedil;&otilde;es. Infelizmente n&atilde;o existe uma forma segura de um espi&atilde;o se comunicar em um per&iacute;odo de guerra, ent&atilde;o as mensagens s&atilde;o sempre enviadas em c&oacute;digo para que somente o destinat&aacute;rio consiga ler a mensagem e entender o seu significado.</p>

<p>Os espi&otilde;es utilizam o unico servi&ccedil;o que funciona no per&iacute;odo de guerra, os correios. Cada cidade possui uma ag&ecirc;ncia postal onde as cartas s&atilde;o enviadas. As cartas podem ser enviadas diretamente ao seu destino ou a outras ag&ecirc;ncias postais, at&eacute; que a carta chegue &agrave; ag&ecirc;ncia postal da cidade de destino, se isso for poss&iacute;vel.</p>

<p>Uma ag&ecirc;ncia postal na cidade A pode enviar diretamente uma carta impressa para a ag&ecirc;ncia postal da cidade B se houver um acordo de envio de cartas, que determina o tempo, em horas, que uma carta leva para chegar da cidade A &agrave; cidade B (e n&atilde;o necessariamente o contr&aacute;rio).a Se n&atilde;o houver um acordo entre as ag&ecirc;ncias A e B, a ag&ecirc;ncia A pode tentar enviar a carta a quantas ag&ecirc;ncias for necess&aacute;rio para que a carta chegue ao seu destino, se isso for poss&iacute;vel.</p>

<p>Algumas ag&ecirc;ncias s&atilde;o interligadas por meios eletr&ocirc;nicos de comunica&ccedil;&atilde;o, como sat&eacute;lites e fibras &oacute;pticas. Antes da guerra, essas liga&ccedil;&otilde;es atingiam todas as ag&ecirc;ncias, fazendo com que uma carta fosse enviada de forma instant&acirc;nea, mas durante o per&iacute;odo de hostilidades cada pa&iacute;s passou a controlar a comunica&ccedil;&atilde;o eletr&ocirc;nica e uma ag&ecirc;ncia somente pode enviar uma carta a outra ag&ecirc;ncia por meio eletr&ocirc;nico (ou seja, instantaneamente) se ela estiver no mesmo pa&iacute;s. Duas ag&ecirc;ncias, A e B, est&atilde;o no mesmo pa&iacute;s se houver uma forma de uma carta impressa enviada de uma das ag&ecirc;ncias ser entregue na outra ag&ecirc;ncia.</p>

<p>O servi&ccedil;o de espionagem do seu pa&iacute;s conseguiu obter o conte&uacute;do de todos os acordos de envios de mensagens existentes no mundo e deseja descobrir o tempo m&iacute;nimo para se enviar uma carta entre diversos pares de cidades. Voc&ecirc; seria capaz de ajud&aacute;-lo?</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha de cada caso de teste cont&eacute;m dois inteiros separados por um espa&ccedil;o, N (1 &le; N &le; 500) e E (0 &le; E &le; N<sup>2</sup>), indicando o n&uacute;mero de cidades (numeradas de 1 a N) e de acordos de envio de mensagens, respectivamente. Seguem-se, ent&atilde;o, E linhas, cada uma com tr&ecirc;s inteiros separados por espa&ccedil;os, X, Y e H (1 &le; X, Y &le; N, 1 &le; H &le; 1000), indicando que existe um acordo para enviar uma carta impressa da cidade X &agrave; cidade Y , e que tal carta ser&aacute; entregue em H horas.</p>

<p>Em seguida, haver&aacute; uma linha com um inteiro K (0 &le; K &le; 100), o n&uacute;mero de consultas. Finalmente, vir&atilde;o K linhas, cada uma representando uma consulta e contendo dois inteiros separados por um espa&ccedil;o, O e D (1 &le; O, D &le; N). Voc&ecirc; deve determinar o tempo m&iacute;nimo para se enviar uma carta da cidade O &agrave; cidade D. A entrada termina quando N = E = 0.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve produzir K linhas na sa&iacute;da. A I-&eacute;sima linha deve conter um inteiro M , o tempo m&iacute;nimo, em horas, para se enviar uma carta na I-&eacute;sima consulta. Se n&atilde;o houver meio de comunica&ccedil;&atilde;o entre as cidades da consulta, voc&ecirc; deve imprimir &rdquo;Nao e possivel entregar a carta&rdquo;(sem acentos).</p>

<p>Imprima uma linha em branco ap&oacute;s cada caso de teste.</p>