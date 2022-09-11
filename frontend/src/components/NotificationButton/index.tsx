import icon from '../../assets/img/notification-icon.svg'
import { BASE_URL } from '../../utils/request';
import axios from 'axios';

import './styles.css'

type Props = {
    saleId: number;
}
//Chama api, o endpoint que envia sms
function handleClick(id : number){
    axios(`${BASE_URL}/sales/${id}/notification`)
        .then(response => {
            console.log("Sucesso");
        });
}

function NotificationButton({saleId}: Props) {
    return (
        <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
            <img src={icon} alt="Notificar" />
        </div>
    )
}

export default NotificationButton
