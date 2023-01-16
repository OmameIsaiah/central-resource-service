package swipe.ng.util;

public class MessageUtil {
    public final static String NOT_FOUND_MERCHANT = "Oops! Record with specified constraints not found";
    public final static String CARD_REQUIRED = "Oops, denied because your linked card is not valid. Link a valid card with at least 3 month expiry date by funding your wallet with any amount";
    public final static String USED_SAME_CARD = "Oops, it seems you activated the swipe card with a card associated with another user";
    public final static String CARD_CLEARED = "Fund on the card cleared successfully";
    public final static String APP_UPDATE_REQUIRED = "Hello, kindly download new version of the application for better performance";
    public final static String TRANSACTION_DELINED = "Transaction not successful please try again";
    public final static String CREDIT_REQUEST_NOT_ALLOWED = "You are currently ineligible to get credit because you defaulted on repayment the last time. Contact support on the next steps.";
    public final static String NOT_QUALIFIED_FOR_CREDIT = "We could not find enough information on the linked account to approve the request. Kindly try another account please";
    public final static String LOCK_WITHDRAWAL_MESSAGE = "We are sorry, withdrawal from Core Vault is only allow after 3 months";
    public final static String TARGET_WITHDRAWAL_MESSAGE = "We are sorry, withdrawal from Core Vault is only allow after 1 month";
    public final static String CORE_WITHDRAWAL_MESSAGE = "Oops, Minimum of one months";
    public final static String CORE_WITHDRAWAL_NOT_ALLOWED = "We are sorry, withdrawal from Core Vault is only allow after 24hrs";
    public final static String BEFORE_MATURITY_DATE = "Early withdrawal will attract a 60% charge on the accrued interest. Do you wish to proceed?";
    public final static String OWNING_CREDIT = "Your outstanding debt will be deducted from the savings. Do you wish to proceed?";
    public final static String BOTH_MATURITY_AND_CREDIT = "Early withdrawal fee and outstanding debt will be charged from the savings. Proceed?";
    public final static String CREDIT_LIMIT = "Oops!, you are only eligible to request a credit once in a month";
    public final static String CREDIT_EXCEEDED = "No vex oo, you have already exceeded the number of requests allowed for the month";
    public final static String PAY_OUTSTANDING = "Oops!, kindly pay back the oustanding balance of N%.2f before you make another request";
    public final static String REPAYMENT_SUCCESSFUL = "Great, you have successfully paid your unsettle credit of N%.2f";
    public final static String SERVICE_KOSI = "Unable to complete request at the moment.Please try again";
    public final static String APPROVED_AMOUNT = "You are only eligible to get the sum of N%.2f on your card. Do you want us to fund your card with the stated amount?";
    public final static String SERVICE_NOT_AVAILABLE = "We are sorry, service unavailable. Kindly wait a bit and your card will be activated";
    public final static String INVALID_REFERENCE_NUMBER = "Invalid reference number. Reference number has been used for a previous transaction";
    public final static String TOP_UP_NOT_OKAY = "Maximum top up exceeded";
    public final static String ACTIVE_SAVING_EXCEEDED = "Maximum number of opened vaults exceeded";
    public final static String TOP_UP_OKAY = "Top up Successful";
    public final static String RECORD_UPDATED = "Great, your request has been sent. Kindly wait for update on the status of your request";
    public final static String DUPLICATE_REQUEST = "Hello, your request is pending, kindly wait for a reply. This should not take time";
    public final static String INVALID_FILE_SIZE = "Oops!, the file size seems to be too large. Do you mind reducing the size?";
    public final static String FAILED = "Failed";
    public final static String DELAY_REQUEST = "Hello, due to a system upgrade your credit request cannot be approved at this time. Please try again in a few hours.";
    public final static String RETRY = "Retry";
    public final static String ADMIN_MESSAGE_RESPONSE = "Your message has been sent successfully!";
    public final static String SUCCESS = "Success";
    public final static Boolean TRUE = true;
    public static final String TRANSACTION__MESSAGE_SUCCESS = "Transaction message sent successfully!";

    public final static Boolean FALSE = false;
    public final static String OUTSTANDING_BALANCE_UNSETTLED = "Hello, your request could not be completed because you still have outstanding balance to settle";
    public final static String REQUEST_SEND = "Hello, your request has been sent, please hold on..";
    public final static String LINK_ACCOUNT = "SwipeNG requires you to link your account to enable us determine how much you\n" +
            "            are qualified for.\n Please link your most active bank account to stand a chance to get a loan";
    public final static String BVN_REQUIRED = "Great, now kindly verify your BVN and bank details to proceed..";
    public final static String BVN_NOT_MATCH = "Oops!, the BVN does not match the account provided. Kindly provide a matching BVN and let's get started..";
    public final static String BVN_BLOCK = "Oops!, it seems your BVN has been blocked by your financial institution. We advise that you contact your financial institution to get this resolved..";
    public final static String INTERNAL_SERVER_ERROR = SERVICE_KOSI;
    public final static String INVALID_QUESTION = "Hello, you have chosen an invalid secret question, kindly select from the list. Thank You";

    public final static String PIN_ALREADY_SET = "Hello. You have already set your secret pin. However, feel free to make changes should you wish to. Thank You";
    public final static String PIN_CHANGED = "Yay! Your transaction PIN has been successfully updated. Now, let's get started..";
    public final static String PIN_NOT_SET = "Oops!, you are yet to set your transaction PIN. Kindly set your transaction pin to get started..";
    public final static String INVALID_SEC_ANSWER = "Oops!, wrong security answer. Relax, we are sure you will recall in no time...";
    public final static String PIN_VERIFIED = "Awesome. Transaction PIN verification has been completed. Now let's get started..";
    public final static String ENROL_UPDATE = "Biometric created successful";
    public final static String INVALID_REQUEST = "Oops!, invalid request. Do you mind trying again?";
    public final static String BIOMETRIC_EXIST = "Data is already captured";
    public final static String MERCHANT_NOT_FOUND = "Oops!, merchant verification failed";
    public final static String INVALID_WALLET = "Oops!, no funds in your wallet. Kindly fund the wallet to get started";
    public final static String CARD_ACTIVATION_WALLET_FAILED = "Oops!, card activation through wallet channel is temporarily disabled, kindly use your card to make payment";
    public final static String INVALID_CARD = "Bummer!, you do not have an active card. Kindly activate your card and start swiping!";
    public final static String CHARGES_TRANSACTION = "Transaction Charges";
    public final static String CHARGES_CARD_MAINTENANCE = "Card Maintenance";
    public final static String CHARGES_WITHDRAWAL = "Withdrawal Charges";
    public final static String CHARGES_WALLET_CASHOUT = "Wallet cash out";
    public final static String CHARGES_DEFAULT_USER = "Default Charges";
    public final static String DUPLICATE_ENTRY = "Hold up, the record already exists. No need to duplicate...";
    public final static String WALLET_FUNDED = "Yay! Your wallet has been funded with a sum of N%.2f";
    public final static String MAX_WITHDRAWAL_EXCEEDED = "Oops, maximum number of free withdrawals exceeded. Do you still want to proceed?. if so, please note that this will attract a fee..";
    public final static String WITHDRAWAL_NOT_ALLOWED = "Oops! you cannot transfer from this vaults plan, that is only possible on an opened plan.";
    public final static String WITHDRAWAL_DATE_NOT_REACHED = "Oops!. You cannot initiate a withdrawal on this plan because the minimum date required has not been met. Sincere apologies..";
    public final static String ACTIVE = "Active";
    public final static String AUTH_ERROR = "Authentication error";
    public final static String NOT_ACTIVE = "Closed";
    public final static String TRANSFER_SUCCESSFUL = "Yay! funds successfully transferred to your wallet";
    public final static String WITHDRAWAL_NOT_SUCCEED = "Oops! You cannot initiate a withdrawal on this plan";
    public final static String SWIPE_PAY_ONLY = "Hello, here is a breakdown of your interest rates as it accrued. Feel free to ask us questions if you have any";
    public final static String SAVED = "Awesome!, your record was saved successfully ";
    public final static String UPDATED = "Great, your record was updated successfully";
    public final static String EMPTYCONTENT = "Hello, kindly fill the required fields because we cannot save an empty request";
    public final static String PAY_NOT_FOUND = "Oops!, you have insufficient funds to complete this transaction. Kindly fund your wallet to proceed";

    public final static String NOT_FOUND = "Oops, record not found. Sorry";
    public final static String APPROVED_DONE = "Oops, record already approved";
    public final static String TRANSFER_ERROR = "Oops, record not found. Sorry or card error contact the admin";
    public final static String PIN_NOT_CORRECT = "Kindly contact support to generate your secret question to reset your pin";
    public final static String DELETED = "Delete Operation Successful";
    public final static String WITHDRAWAL_DECLINE = "Withdrawal decline, have you already approve/delcine the request previously?";
    public final static String DUPLICATE_ACCOUNT_DETECTED = "this id already has an account";
    public final static String RECORD_NOT_AVAILABLE = "Oops!, sorry, record not available";
    public final static String CARD_CREATED = "Awesome, your card has been created successfully. Now, start swiping!";
    public final static String CARD_ERROR = "Oops!, an error occurred while creating the card. Kindly give us some a few minutes to resolve. Thank you for trusting us.";
    public final static String CARD_CREDIT_ERROR = "Oops!, an error occurred while crediting the card. Please try again. Thank you for trusting us.";
    public final static String CARD_EXISTS = "Oops!, it seems you already have an active card on this account";
    public final static String SUCCESS_RESP = "Success";
    public final static String INTEREST_EMPTY = "Oops!, you have insufficient balance to complete this transaction";

    public final static String ACCOUNT_TYPE = "ADMINISTRATOR";
    public final static String ACCOUNT_DISABLED = "Hello, your account has been disabled successfully. Please feel free to come back, thanks";
    public final static String RECORD_EXISTS = "Oops, email and phone number already in use. Please try again using another email and phone number";
    public static final int ONE_DAY = 60 * 60 * 24 * 24;
    public final static String RECORD_NOT_FUND = "Oops!, we have no record of such a user. Perhaps you made a mistake?";
    public final static String INVALID_SAVING_TYPE = "Hello, saving type not found. Do you mind trying again?";
    public final static String SAVINGS_COMPLETED = "Yay! you have successfully created a vault, now watch your money grow..";
    public final static String CARD_NOT_FOUND = "Oops!, there are no active cards available on this account..";
    public final static String CARD_HAS_BALANCE = "Oops!, transaction not successful, you still have sum of ";

    public final static String SAVING_NOT_FOUND = "Hello. You are yet to make savings. You are a click away from getting started..";
    public final static String INSUFFICIENT_FUND = "Oops!, Seems you have to fund your account to complete this transaction";
    public final static String INSUFFICIENT_FUND_CARD = "Oops!, Seems you have to fund your Swipe card to complete this transaction";
    public final static String NEGATIVE_VALUE_ERROR = "Negative values not allowed";
    public final static String DENIED_BY_FRAUD = "Oops! transaction denied by fraud system";
    public final static String DENIED_BY_FRAUD_2 = "Oops! transaction denied by fraud system, kindly update your profile.";
    public final static String DENIED_BY_FRAUD_V2 = "Oops! transaction denied by fraud system, kindly try again";
    public final static String WITHDRAWAL_COMPLETED = "Yay! You have transferred successfully. Click the button below to continue";
    public final static String CARD_FUNDED = "Great news!, Your card has been funded with a sum of N%.2f. Now let's get started";
    public final static String AUTO_SAVE_NOT_DISABLED = "Oops!, unable to disable autosave right now, please try again later..";
    public final static String AUTO_SAVE_NOT_ENABLED = "Oops, unable to enable autosave at the moment, please try again later..";
    public final static String INVALID_PASSWORD = "Oops, the password is incorrect. Kindly check and try again please";
    public final static String PASSWORD_CHANGED = "Great, your password has been changed successfully";
    public final static String DUPLICATE_TRANSACTION = "Oops, you have exceeded the maximum number of withdrawal for today. Kindly contact support";
    public final static String DUPLICATE_TRANSACTIONS = "Duplicate transactions detected";
    public final static String TRANSACTION_SUCCESSFUL = "Yay! transaction processed successfully";
    public final static String DUPLICATE_TRANSAC = "Oops, Duplicate transaction, kindly wait for the previous transaction to complete";
    public final static String CONTACT_ADMIN_ERROR = "An error occurred. Please try again or contact support if the error persists";
    public final static String DATA_NOT_PRESENT = "Oops! The account with the specified email address does not exist";
    public final static String SERVER_ERROR = "An error occur please contact administrator";

    public final static String PIN_RESET_INITIATED = "Awesome, you have initiated pin reset, kindly check your email "
            + "to continue this process";
    public final static String PASSWORD_RESET = "Awesome, password reset completed. Kindly check registered email address for your new password..";

    public final static String PASSWORD_RESET_INITIATED = "Awesome, you have initiated password reset, kindly check your email "
            + "to continue this process";
    public final static String ACCOUNT_ACTIVE = "Awesome, your account already active, please login to proceed";
    public final static String ACCOUNT_NOT_ACTIVE = "Account not active yet. Please check your email and follow the step to activate account";
    public final static String INVALID_CREDENTIALS = "Oops, activation link expired or invalid credential";
    public final static String ERROR_FUNDING_CARD = "An error occurred while funding your card. Try again later";
    public final static String CARD_TRANSFER_SUSPENDED = "Oops!, Card transfer temporarily suspended";
    public final static String DONE = "Awesome, operation successfully processed";
    public final static String UNAUTHORIZE = "Access denied for this resource";

    public static final String EMAIL_SENT = "Email activation sent to the registered email address";

    public static final String ERROR = "Error";

}
